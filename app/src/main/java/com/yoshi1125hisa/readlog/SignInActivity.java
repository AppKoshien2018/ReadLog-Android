package com.yoshi1125hisa.readlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_sign_in);
    }
}
