package com.akki.textgredient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GradientTextView gTv = (GradientTextView)findViewById( R.id.g_tv );
        //gTv.setText("ABC");

    }
}
