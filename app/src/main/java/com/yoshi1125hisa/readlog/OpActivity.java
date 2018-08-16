package com.yoshi1125hisa.readlog;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class OpActivity extends AppCompatActivity {


//    private boolean clickedFav = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Explode());
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_op);

        TextView titleText;
        titleText = findViewById(R.id.titleText);
        titleText.setTypeface(Typeface.createFromAsset(getAssets(),
                "skia.ttf"));

        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSign();

            }
        });




//        final LottieAnimationView animationView = findViewById(R.id.animation_view);
//        animationView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(clickedFav) {
//                    // setProgress(0f)でアニメーション開始前状態にします。
//                    animationView.setProgress(0f);
//                    clickedFav = false;
//                } else {
//                    animationView.playAnimation();
//                    clickedFav = true;
//                }
//            }
//        });
    }

    private void gotoSign() {
        Intent intent = new Intent(this, SignActivity.class);
        startActivity(intent,
                ActivityOptions.makeSceneTransitionAnimation(this, (Pair<View, String>[]) null).toBundle());
    }

}
