package com.moyinoluwa.hellotest.greeting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.moyinoluwa.hellotest.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    EditText editText;
    TextView textView;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext);
        textView = (TextView) findViewById(R.id.hello_textview);

        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void showGreeting(@NonNull String greeting) {
        textView.setText(greeting);
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
    }

    public void displayGreeting(View view) {
        String greeting;

        if (editText.getText().toString().isEmpty()) {
            mainPresenter.composeEmptyGreeting();
        } else {
            greeting = editText.getText().toString();
            mainPresenter.composeGreeting(greeting);
        }
    }
}
