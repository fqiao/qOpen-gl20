package com.fq.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fq.opengl.MyGlSurfaceView;

public class MainActivity extends AppCompatActivity {

    MyGlSurfaceView myGlSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGlSurfaceView = new MyGlSurfaceView(this);
        setContentView(myGlSurfaceView);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
