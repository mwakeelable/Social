package com.wakeel.social.base.presentation;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

    boolean isActive();
}
