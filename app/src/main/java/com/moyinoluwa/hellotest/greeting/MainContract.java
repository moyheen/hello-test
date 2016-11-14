package com.moyinoluwa.hellotest.greeting;

import android.support.annotation.NonNull;

import com.moyinoluwa.hellotest.BasePresenter;
import com.moyinoluwa.hellotest.BaseView;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void showGreeting(@NonNull String greeting);
    }

    interface Presenter extends BasePresenter {

        void composeGreeting(String firstname);
    }
}
