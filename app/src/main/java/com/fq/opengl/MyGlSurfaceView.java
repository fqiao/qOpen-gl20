package com.fq.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Created by acer on 2017/2/23.
 */

public class MyGlSurfaceView extends GLSurfaceView {

    private final float TOUCH_SCAL_FACTOR = 180.8F / 320;
    private float previousX;
    private float previousY;

    private final MyGlRenderer mRenderer;

    public MyGlSurfaceView(Context context) {
        super(context);

        setEGLContextClientVersion(2);
        mRenderer = new MyGlRenderer();
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                float dx = x - previousX;
                float dy = y - previousY;

                // reverse direction of rotation above the mid-line
                if (y > getHeight() / 2) {
                    dx *= -1;
                }

                // reverse direction of rotation to left of the mid-line
                if (x > getWidth() / 2) {
                    dy *= -1;
                }

                mRenderer.setAngle(mRenderer.getAngle() + ((dx + dy) * TOUCH_SCAL_FACTOR));
                requestRender();
        }

        previousX = x;
        previousY = y;
        //return super.onTouchEvent(event);
        return true;
    }
}
