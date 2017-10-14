package com.wakeel.social.data.presentation;

public interface Contract {
    public interface View extends BaseView<Presenter> {

    }

    public interface Presenter extends BasePresenter {
        void fetchFBNewsFeed();
        void fetchTWNewsFeed();
        void fetchGPNewsFeed();
    }
}
