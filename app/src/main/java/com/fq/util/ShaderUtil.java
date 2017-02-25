package com.fq.util;

import android.opengl.GLES20;

/**
 * Created by acer on 2017/2/23.
 */

public class ShaderUtil {

    public static int loadShader(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
