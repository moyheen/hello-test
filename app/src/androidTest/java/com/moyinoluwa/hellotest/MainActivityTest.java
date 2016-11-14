package com.moyinoluwa.hellotest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.moyinoluwa.hellotest.greeting.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by moyinoluwa on 11/14/16.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private String validString;
    private String emptyString;

    private String validStringGreeting;
    private String emptyStringGreeting;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>
            (MainActivity.class);

    @Before
    public void initString() {
        validString = "Moyin";
        emptyString = "";
        validStringGreeting = "Hello Moyin";
        emptyStringGreeting = "Hello stranger :)";
    }

    @Test
    public void displayGreetingWithName() {
        onView(withId(R.id.edittext)).perform(clearText(), typeText(validString),
                closeSoftKeyboard());
        onView(withId(R.id.display_greeting_button)).perform(click());
        onView(withId(R.id.hello_textview)).check(matches(withText(validStringGreeting)));
    }

    @Test
    public void displayGreetingWithNoNameEntered() {
        onView(withId(R.id.edittext)).perform(clearText(), typeText(emptyString),
                closeSoftKeyboard());
        onView(withId(R.id.display_greeting_button)).perform(click());
        onView(withId(R.id.hello_textview)).check(matches(withText(emptyStringGreeting)));
    }
}
