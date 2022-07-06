package org.zzh.mathlab.utils;

import org.zzh.mathlab.tools.Point3D;
import org.zzh.mathlab.tools.Vector3D;

public class Point3DUtils {
    private Point3DUtils() {
    }

    /**
     * 两点距离
     *
     * @param a
     * @param b
     * @return
     */
    public static Double distance(Point3D a, Point3D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2.0) +
                Math.pow(a.getY() - b.getY(), 2.0) +
                Math.pow(b.getH() - a.getH(), 2.0));
    }

    /**
     * 是否在球体中
     *
     * @param center
     * @param r
     * @param test
     * @return
     */
    public static Boolean isInBall(Point3D center, Double r, Point3D test) {
        return distance(test, center).compareTo(r) <= 0;
    }


    /**
     * 计算两个点的方向矢量
     *
     * @param from
     * @param to
     * @return
     */
    public static Vector3D direction(Point3D from, Point3D to) {
        return Vector3DUtils.reduce((Vector3D) to, (Vector3D) from);
    }

    /**
     * 点移动
     *
     * @param a
     * @param foot
     * @return
     */
    public static Point3D move(Point3D a, Vector3D foot) {
        return Vector3DUtils.add((Vector3D) a, foot);
    }

}
