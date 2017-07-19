package com.hilfritz.android_clean_architecture.domain.interactors.welcoming;

import com.hilfritz.android_clean_architecture.domain.executor.Executor;
import com.hilfritz.android_clean_architecture.domain.executor.MainThread;
import com.hilfritz.android_clean_architecture.domain.interactors.base.AbstractInteractor;
import com.hilfritz.android_clean_architecture.domain.repository.MessageRepository;

/**
 * Created by Hilfritz Camallere on 18/7/17.
 */

public class WelcomingInteractorImpl extends AbstractInteractor implements WelcomingInteractor{

    private WelcomingInteractor.Callback mCallback;
    private MessageRepository mMessageRepository;

    public WelcomingInteractorImpl(Executor threadExecutor, MainThread mainThread, WelcomingInteractor.Callback mCallback, MessageRepository mMessageRepository) {
        super(threadExecutor, mainThread);
        this.mCallback = mCallback;
        this.mMessageRepository = mMessageRepository;
    }

    private void notifyError() {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onRetrievalFailed("Nothing to welcome you with :(");
            }
        });
    }

    private void postMessage(final String msg) {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onMessageRetrieved(msg);
            }
        });
    }

    @Override
    public void run() {

        // retrieve the message
        final String message = mMessageRepository.getWelcomeMessage();

        // check if we have failed to retrieve our message
        if (message == null || message.length() == 0) {

            // notify the failure on the main thread
            notifyError();

            return;
        }

        // we have retrieved our message, notify the UI on the main thread
        postMessage(message);
    }

}
