package com.hilfritz.android_clean_architecture.presentation.presenters;

import com.hilfritz.android_clean_architecture.presentation.presenters.base.BasePresenter;
import com.hilfritz.android_clean_architecture.presentation.ui.BaseView;


public interface MainPresenter extends BasePresenter {

    interface View extends BaseView {
        void displayWelcomeMessage(String str);
    }

    // TODO: Add your presenter methods

}
