package com.edwardtorpy.animationexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void enterNumber (View view) {
        EditText numberText = (EditText) findViewById(R.id.editText);
        ImageView image = (ImageView) findViewById(R.id.imageView);

        float percentage  = Float.valueOf(numberText.getText().toString());

        image.animate().translationYBy(percentage);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
