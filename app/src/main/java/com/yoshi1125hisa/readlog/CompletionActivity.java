package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CompletionActivity extends AppCompatActivity{

    TextView doneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Explode());
        //ページ遷移のアニメーション。
        setContentView(R.layout.activity_completion);


        doneText = findViewById(R.id.doneText);
        doneText.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));

        Handler hdl = new Handler();
        // 第２引数で切り替わる秒数(ミリ秒)を指定、今回は5秒
        hdl.postDelayed(new splashHandler(), 5000);
    }
    // splashHandlerクラス
    class splashHandler implements Runnable {
        public void run() {
            Intent intent = new Intent(CompletionActivity.this, MainActivity.class);
            startActivity(intent);
            CompletionActivity.this.finish();
        }
    }
}