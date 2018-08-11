package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        //ページ遷移のアニメーション。
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
    Intent intent = new Intent(this,SignInActivity.class);
    startActivity(intent);
    }


    public void signup(View v){
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}
