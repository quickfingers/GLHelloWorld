package efthemiosprime.com.glhelloworld;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLRendererHelper implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        // called when an new surface has been created
        // create opengl resource here
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        // called when new GLSurface has been created or changes size
        // set the opengl es camera viewport here
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        // put code to draw 3d objects to screen here
    }
}
