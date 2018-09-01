package com.yoshi1125hisa.readlog;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import net.taptappun.taku.kobayashi.runtimepermissionchecker.RuntimePermissionChecker;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

import static com.google.zxing.integration.android.IntentIntegrator.REQUEST_CODE;

public class OpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Explode());
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_op);

        RuntimePermissionChecker.requestAllPermissions(this, REQUEST_CODE);

        TextView titleText;
        titleText = findViewById(R.id.titleText);
        titleText.setTypeface(Typeface.createFromAsset(getAssets(),
                "skia.ttf"));

        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSign();
                Intent intent = new Intent(OpActivity.this,SignActivity.class);
                startActivity(intent);

            }
        });

    }
    //    ログインしているか、していないかの確認
    public void gotoSign() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // サインインしている状態
            Intent intent = new Intent(OpActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this, (Pair<View, String>[]) null).toBundle());
        } else {
            // サインインしていない状態
            //Log.d("TAG", "onAuthStateChanged:signed_out");
            Intent intent = new Intent(this, SignActivity.class);
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this, (Pair<View, String>[]) null).toBundle());
        }



    }

}
