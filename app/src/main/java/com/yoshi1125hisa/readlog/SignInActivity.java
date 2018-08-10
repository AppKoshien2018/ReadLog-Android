package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_sign_in);
    }

    public void signin(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
