package com.wakeel.social.base.presentation;

public interface Contract {
    public interface View extends BaseView<Presenter> {

    }

    public interface Presenter extends BasePresenter {
        void fetchFBNewsFeed();
        void fetchTWNewsFeed();
        void fetchGPNewsFeed();
    }
}
