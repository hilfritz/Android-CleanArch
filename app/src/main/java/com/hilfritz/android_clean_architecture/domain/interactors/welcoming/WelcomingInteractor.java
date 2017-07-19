package com.hilfritz.android_clean_architecture.domain.interactors.welcoming;

/**
 * Created by Hilfritz Camallere on 18/7/17.
 */

public interface WelcomingInteractor {
    interface Callback{
        void onMessageRetrieved(String message);
        void onRetrievalFailed(String error);
    }
}
