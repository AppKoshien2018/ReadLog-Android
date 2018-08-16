package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignOutActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private TextView signOutText;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Explode());
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_sign_out);


        signOutText = findViewById(R.id.signOutText);
        signOutText.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));
        signOutButton = findViewById(R.id.signOutButton);
        signOutButton.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.signOutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent intent = new Intent(SignOutActivity.this, OpActivity.class);
                startActivity(intent);
                finish(); // ?
            }
        });
    }


}
