package com.wakeel.social.data.domain;


public abstract class UseCase <Q extends UseCase.RequestValues, P extends UseCase.ResponseValue> {

    private UseCaseCallback<P> mUseCaseCallback;

    private Q mRequestValues;

    public UseCaseCallback<P> getmUseCaseCallback() {
        return mUseCaseCallback;
    }

    public void setmUseCaseCallback(UseCaseCallback<P> mUseCaseCallback) {
        this.mUseCaseCallback = mUseCaseCallback;
    }

    public Q getmRequestValues() {
        return mRequestValues;
    }

    public void setmRequestValues(Q mRequestValues) {
        this.mRequestValues = mRequestValues;
    }

    void run() {
        executeUseCase(mRequestValues);
    }

    protected abstract void executeUseCase(Q requestValues);

    /**
     * Data passed to a request.
     */
    public interface RequestValues {
    }

    /**
     * Data received from a request.
     */
    public interface ResponseValue {
    }


    public interface UseCaseCallback<P> {
        void onSuccess(P response);
        void onError(String message);
    }
}
