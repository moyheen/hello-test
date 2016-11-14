package com.moyinoluwa.hellotest.greeting;

import dagger.Provides;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public class MainPresenterModule {

    private final MainContract.View mView;

    private MainPresenterModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    MainContract.View provideMainContractView() {
        return mView;
    }
}
