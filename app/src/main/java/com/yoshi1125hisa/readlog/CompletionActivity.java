package com.yoshi1125hisa.readlog;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CompletionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completion);

        TextView doneText;
        doneText = findViewById(R.id.doneText);
        doneText.setTypeface(Typeface.createFromAsset(getAssets(),
                "hiragino.ttf"));

        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // もしログインしているなら、MainActivityに移動する。

                // そうでないなら、SignActivityに移動する。
                Intent intent = new Intent(CompletionActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        // もしアニメーションが終了して入れば、次のActivityへ移動する。
    }
}
