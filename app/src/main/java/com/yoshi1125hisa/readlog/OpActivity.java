package com.yoshi1125hisa.readlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class OpActivity extends AppCompatActivity {

//    private boolean clickedFav = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);


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
}
