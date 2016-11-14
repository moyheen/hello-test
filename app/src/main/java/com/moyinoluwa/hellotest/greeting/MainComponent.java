package com.moyinoluwa.hellotest.greeting;

import dagger.Component;

/**
 * Created by moyinoluwa on 11/14/16.
 */

@Component(modules = MainPresenterModule.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
