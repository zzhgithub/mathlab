package org.zzh.mathlab.utils;


import org.apache.commons.math3.util.FastMath;
import org.zzh.mathlab.tools.Point3D;
import org.zzh.mathlab.tools.Vector3D;

public class Vector3DUtils {
    private Vector3DUtils() {
    }


    /**
     * 矢量取反
     *
     * @param a
     * @return
     */
    public static Vector3D ops(Vector3D a) {
        return new Vector3D(-a.getX(), -a.getY(), -a.getH());
    }

    /**
     * 矢量加法
     *
     * @param a
     * @param b
     * @return
     */
    public static Vector3D add(Vector3D a, Vector3D b) {
        return new Vector3D(a.getX() + b.getX(), a.getY() + b.getY(), a.getH() + b.getH());
    }

    /**
     * 矢量减法
     *
     * @param a
     * @param b
     * @return
     */
    public static Vector3D reduce(Vector3D a, Vector3D b) {
        return add(a, ops(b));
    }

    /**
     * 倍数
     *
     * @param a
     * @param times
     * @return
     */
    public static Vector3D times(Vector3D a, Double times) {
        return new Vector3D(a.getX() * times, a.getY() * times, a.getH() * times);
    }

    /**
     * 两个向量 点乘法
     *
     * @param a
     * @param b
     * @return
     */
    public static Double dotMulti(Vector3D a, Vector3D b) {
        return a.getX() * b.getY() + a.getY() + b.getY() + a.getH() * b.getH();
    }

    /**
     * 向量模长
     *
     * @param a
     * @return
     */
    public static Double measure(Vector3D a) {
        return Point3DUtils.distance(Point3D.O, a);
    }


    /**
     * 两个向量夹角余弦值
     *
     * @param a
     * @param b
     * @return
     */
    public static Double cosOf(Vector3D a, Vector3D b) {
        return dotMulti(a, b) / (measure(a) * measure(b));
    }

    /**
     * 计算两个 向量的夹角 弧度制
     *
     * @param a
     * @param b
     * @return
     */
    public static double angle(Vector3D a, Vector3D b) {
        return FastMath.acos(cosOf(a, b));
    }
}
