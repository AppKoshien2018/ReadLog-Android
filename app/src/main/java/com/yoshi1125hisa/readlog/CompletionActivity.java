package com.yoshi1125hisa.readlog;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
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

        // もしアニメーションが終了して入れば、次のActivityへ移動する。
    }
}
