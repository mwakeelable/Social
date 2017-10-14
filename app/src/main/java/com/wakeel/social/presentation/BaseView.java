package com.wakeel.social.data.presentation;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

    boolean isActive();
}
