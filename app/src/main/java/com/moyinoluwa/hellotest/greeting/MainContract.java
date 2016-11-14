package com.moyinoluwa.hellotest.greeting;

import com.moyinoluwa.hellotest.BasePresenter;
import com.moyinoluwa.hellotest.BaseView;

/**
 * Created by moyinoluwa on 11/14/16.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void showGreeting();
    }

    interface Presenter extends BasePresenter {

        void composeGreeting();
    }
}
