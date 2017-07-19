package com.hilfritz.android_clean_architecture.presentation.presenters.impl;

import com.hilfritz.android_clean_architecture.domain.executor.Executor;
import com.hilfritz.android_clean_architecture.domain.executor.MainThread;
import com.hilfritz.android_clean_architecture.domain.interactors.welcoming.WelcomingInteractorImpl;
import com.hilfritz.android_clean_architecture.domain.interactors.welcoming.WelcomingInteractor;
import com.hilfritz.android_clean_architecture.domain.repository.MessageRepository;
import com.hilfritz.android_clean_architecture.presentation.presenters.MainPresenter;
import com.hilfritz.android_clean_architecture.presentation.presenters.base.AbstractPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        WelcomingInteractor.Callback {

    private MainPresenter.View mView;
    MessageRepository messageRepository;


    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view,
                             MessageRepository messageRepository) {
        super(executor, mainThread);
        mView = view;
        this.messageRepository = messageRepository;
    }


    @Override
    public void resume() {
        WelcomingInteractorImpl welcomingInteractor = new WelcomingInteractorImpl(mExecutor,mMainThread, this,messageRepository);
        welcomingInteractor.execute();
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onMessageRetrieved(String message) {
        mView.hideProgress();
        mView.displayWelcomeMessage(message);
    }

    @Override
    public void onRetrievalFailed(String error) {
        mView.hideProgress();
        onError(error);
    }
}
