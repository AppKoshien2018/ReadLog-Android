package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAuth mAuth;
    private  EditText mailText,passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView titleText;
        titleText = findViewById(R.id.titleText);
        titleText.setTypeface(Typeface.createFromAsset(getAssets(),
                "skia.ttf"));


        mailText = findViewById(R.id.mailText);
        mailText.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));

        passwordText = findViewById(R.id.passwordText);
        passwordText.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));
        Button signInButton;
        signInButton = findViewById(R.id.signInButton);

        signInButton.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));


        findViewById(R.id.signInButton).setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();

    }


    @Override
    public void onClick(View view) {
               signIn(mailText.getText().toString(), passwordText.getText().toString());

    }

//    private void createAccount(String email, String password) {
//        if (!validateForm()) {
//            return;
//        } mAuth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            changeActivity();
//                        } else {
//                            Toast.makeText(SignInActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }

    private void signIn(String email, String password) {
        if (!validateForm()) {
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            changeActivity();
                        } else {
                            Toast.makeText(SignInActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private boolean validateForm() {
        boolean valid = true;

        String email = mailText.getText().toString();
        if (TextUtils.isEmpty(email)) {
            mailText.setError("Required.");
            valid = false;
        } else {
            mailText.setError(null);
        }

        String password = passwordText.getText().toString();
        if (TextUtils.isEmpty(password)) {
            passwordText.setError("Required.");
            valid = false;
        } else {
            passwordText.setError(null);
        }

        return valid;
    }

    private void changeActivity() {
        Intent intent = new Intent(SignInActivity.this, CompletionActivity.class);
        startActivity(intent);
    }
}