package com.moyinoluwa.hellotest;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by moyinoluwa on 11/14/16.
 */

@Module
public final class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
