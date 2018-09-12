package com.yoshi1125hisa.readlog;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        TextView titleText;
        titleText = findViewById(R.id.titleText);
        titleText.setTypeface(Typeface.createFromAsset(getAssets(),
                "skia.ttf"));

        Button signInButton,signUpButton;
        signInButton = findViewById(R.id.signInButton);

        signInButton.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));
        signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));

    }

    public void signin(View v){
        goSignIn();
    }

    public void signup(View v){
        goSignUp();
    }

    private void goSignIn() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent,
                ActivityOptions.makeSceneTransitionAnimation(this, (Pair<View, String>[]) null).toBundle());
    }

    private void goSignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent,
                ActivityOptions.makeSceneTransitionAnimation(this, (Pair<View, String>[]) null).toBundle());
    }
}
