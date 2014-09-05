package efthemiosprime.com.glhelloworld;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.opengl.GLSurfaceView;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private GLSurfaceView m_GLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GLSurfaceViewHelper V = (GLSurfaceViewHelper)this.findViewById(R.id.glSurfaceView);
        m_GLView = V;

        // Create a GLSurfaView instance and set it
        // as the ContentView for the Activity

        Log.e(TAG, "onCreate() called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        m_GLView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        m_GLView.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


class GLSurfaceViewHelper extends GLSurfaceView
{
    private final GLRendererHelper m_Renderer;

    public GLSurfaceViewHelper(Context context)
    {
        super(context);

        // Create an opengl es 2.0 context
        setEGLContextClientVersion(2);

        // set the renderer drawing on te GLSurfaceView
        m_Renderer = new GLRendererHelper();
        setRenderer(m_Renderer);
    }

    // Constructor that is called when GLSurfaceViewHelper is created i nthe xml layout
    public GLSurfaceViewHelper(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        setEGLContextClientVersion(2);

        m_Renderer = new GLRendererHelper();
        setRenderer(m_Renderer);
    }
}