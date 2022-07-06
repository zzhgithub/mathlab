package org.zzh.mathlab.tools;

import java.io.Serializable;

public class Point3D implements Serializable {

    public final static Point3D O = new Point3D(0.0, 0.0, 0.0);

    protected Double x;
    protected Double y;
    protected Double h;

    public Point3D() {
    }

    public Point3D(Double x, Double y, Double h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }
}
