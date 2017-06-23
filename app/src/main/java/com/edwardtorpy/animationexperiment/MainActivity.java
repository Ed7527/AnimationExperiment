package com.edwardtorpy.animationexperiment;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Px;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Handler handler = new Handler();

    public void fillBucket(View view) {

        ImageView fillImage = (ImageView) findViewById(R.id.imageView7);

        for (int i = 0; i < 180; i++) {
            fillImage.scrollBy(0, 1);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                }
            },1000);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
