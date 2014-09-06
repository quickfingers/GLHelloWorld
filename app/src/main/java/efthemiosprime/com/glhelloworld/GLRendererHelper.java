package efthemiosprime.com.glhelloworld;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLRendererHelper implements GLSurfaceView.Renderer {

    private Context m_Context;
    private PointLight m_PointLight;
    private Camera m_Camera;
    private int m_ViewPortWidth;
    private int m_ViewPortHeight;
    private Cube m_Cube;

    public GLRendererHelper(Context context)
    {
        m_Context = context;
    }

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

    void SetupLights()
    {
        Vector3 LightPosition = new Vector3(0, 125, 125);

        float[] AmbientColor = new float[3];
        AmbientColor[0] = 0.0f;
        AmbientColor[1] = 0.0f;
        AmbientColor[2] = 0.0f;

        float[] DiffuseColor = new float[3];
        DiffuseColor[0] = 1.0f;
        DiffuseColor[1] = 1.0f;
        DiffuseColor[2] = 1.0f;

        float[] SpecularColor = new float[3];
        SpecularColor[0] = 1.0f;
        SpecularColor[1] = 1.0f;
        SpecularColor[2] = 1.0f;

        m_PointLight.SetPosition(LightPosition);
        m_PointLight.SetAmbientColor(AmbientColor);
        m_PointLight.SetDiffuseColor(DiffuseColor);
        m_PointLight.SetSpecularColor(SpecularColor);
    }

    void SetupCamera()
    {
        Vector3 Eye = new Vector3(0,0,8);
        Vector3 Center = new Vector3(0,0, -1);
        Vector3 Up = Vector3.up();

        float ratio = (float) m_ViewPortWidth / m_ViewPortHeight;
        float ProjLeft = -ratio;
        float ProjRight = ratio;
        float ProjBottom = -1;
        float ProjTop = 1;
        float Projnear = 3;
        float Projfar = 50;

    }
}
