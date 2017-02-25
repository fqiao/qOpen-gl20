package com.fq.shapes;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/**
 * Created by acer on 2017/2/  23.
 */

public class Square {
    FloatBuffer vertexBuffer;
    ShortBuffer orderBuffer;

    static final int COORDS_PER_VERTEX = 3;

    static final float squareCoords[] = {
            -0.5f, 0.5f, 0.0f,   // top left
            -0.5f, -0.5f, 0.0f,   // bottom left
            0.5f, -0.5f, 0.0f,   // bottom right
            0.5f, 0.5f, 0.0f // top right
    };

    private short drawOrder[] = {0,1,2,0,2,3};

    public Square(){
        ByteBuffer bb = ByteBuffer.allocateDirect(squareCoords.length*4);
        bb.order(ByteOrder.nativeOrder());
        vertexBuffer = bb.asFloatBuffer();
        vertexBuffer.put(squareCoords);
        vertexBuffer.position(0);

        ByteBuffer dod = ByteBuffer.allocateDirect(drawOrder.length*2);
        dod.order(ByteOrder.nativeOrder());
        orderBuffer = dod.asShortBuffer();
        orderBuffer.put(drawOrder);
        orderBuffer.position(0);
    }
}
