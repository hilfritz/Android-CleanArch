package com.hilfritz.android_clean_architecture.domain.interactors.impl;

import com.hilfritz.android_clean_architecture.domain.executor.Executor;
import com.hilfritz.android_clean_architecture.domain.executor.MainThread;
import com.hilfritz.android_clean_architecture.domain.interactors.SampleInteractor;
import com.hilfritz.android_clean_architecture.domain.interactors.base.AbstractInteractor;
import com.hilfritz.android_clean_architecture.domain.repository.Repository;

/**
 * This is an interactor boilerplate with a reference to a model repository.
 * <p/>
 */
public class SampleInteractorImpl extends AbstractInteractor implements SampleInteractor {

    private SampleInteractor.Callback mCallback;
    private Repository                mRepository;

    public SampleInteractorImpl(Executor threadExecutor,
                                MainThread mainThread,
                                Callback callback, Repository repository) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mRepository = repository;
    }

    @Override
    public void run() {
        // TODO: Implement this with your business logic
    }
}
