package com.example.pictureinpicturedemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void goPip(View view) {
        enterPictureInPictureMode();
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if(isInPictureInPictureMode) {
            getSupportActionBar().hide();
            button.setVisibility(View.INVISIBLE);
        } else {
            getSupportActionBar().show();
            button.setVisibility(View.VISIBLE);
        }
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }
}