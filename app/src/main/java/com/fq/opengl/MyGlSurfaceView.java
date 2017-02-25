package com.fq.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by acer on 2017/2/23.
 */

public class MyGlSurfaceView extends GLSurfaceView {

    private final MyGlRenderer mRenderer;

    public MyGlSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(2);
        mRenderer = new MyGlRenderer();
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
