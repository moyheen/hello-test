package com.moyinoluwa.hellotest.greeting;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public final class MainPresenter implements MainContract.Presenter {
    private final MainContract.View mMainView;

    public MainPresenter(@NonNull MainContract.View mView) {
        mMainView = checkNotNull(mView, "mainView cannot be null");
        mMainView.setPresenter(this);
    }

    @Override
    public void composeGreeting(@NonNull String firstname) {
        mMainView.showGreeting("Hello " + firstname);
    }

    @Override
    public void composeEmptyGreeting() {
        mMainView.showGreeting("Hello stranger :)");
    }


    @Override
    public void start() {
    }
}
