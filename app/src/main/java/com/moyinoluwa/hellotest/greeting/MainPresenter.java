package com.moyinoluwa.hellotest.greeting;

import javax.inject.Inject;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public final class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mMainView;

    @Inject
    MainPresenter(MainContract.View mainView) {
        mMainView = mainView;
    }

    @Override
    public void composeGreeting(String firstname) {

        String greeting = "Hello " + firstname;

        mMainView.showGreeting(firstname);
    }

    @Override
    public void start() {

    }
}
