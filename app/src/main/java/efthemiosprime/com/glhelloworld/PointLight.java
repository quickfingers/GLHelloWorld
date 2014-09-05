package efthemiosprime.com.glhelloworld;

import android.content.Context;

/**
 * Created by esuyat on 9/5/14.
 */
public class PointLight {

    private float[] m_light_ambient = new float[3];
    private float[] m_light_diffuse = new float[3];
    private float[] m_light_specular = new float[3];
    private float m_specular_shininess = 5;


    public PointLight(Context context)
    {
        m_light_ambient[0] = 1.0f;
        m_light_ambient[1] = 1.0f;
        m_light_ambient[2] = 1.0f;

        m_light_diffuse[0] = 1.0f;
        m_light_diffuse[1] = 1.0f;
        m_light_diffuse[2] = 1.0f;

        m_light_specular[0] = 1.0f;
        m_light_specular[1] = 1.0f;
        m_light_specular[2] = 1.0f;


    }

}
