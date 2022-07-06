package org.zzh.mathlab.tools;

public class Vector3D extends Point3D {

    public final static Vector3D O = new Vector3D(0.0, 0.0, 0.0);
    
    public final static Vector3D xAxis = new Vector3D(1.0, 0.0, 0.0);
    public final static Vector3D yAxis = new Vector3D(0.0, 1.0, 0.0);
    public final static Vector3D zAxis = new Vector3D(0.0, 0.0, 1.0);

    public Vector3D(Double x, Double y, Double h) {
        super(x, y, h);
    }
}
