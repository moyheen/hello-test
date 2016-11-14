package com.moyinoluwa.hellotest.greeting;

import android.support.annotation.NonNull;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public final class MainPresenter implements MainContract.Presenter {

    @Override
    public String composeGreeting(@NonNull String firstname) {
        return "Hello " + firstname;
    }

    @Override
    public String composeEmptyGreeting() {
        return "Hello stranger :)";
    }


    @Override
    public void start() {

    }
}
