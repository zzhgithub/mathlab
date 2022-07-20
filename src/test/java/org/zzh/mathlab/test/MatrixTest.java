package org.zzh.mathlab.test;

import junit.framework.TestCase;
import org.junit.Test;
import org.zzh.mathlab.tools.Matrix;
import org.zzh.mathlab.tools.Vector3D;
import org.zzh.mathlab.utils.MatrixUtils;
import org.zzh.mathlab.utils.Vector3DUtils;


public class MatrixTest extends TestCase {

    @Test
    public void test() {
        Matrix matrix = Matrix.build(
                new double[]{1.0, 2.2},
                new double[]{0.0, 2.5}
        );
        assert matrix != null;
        System.out.println(matrix.dump());
    }

    @Test
    public void test2() {
        Matrix a = Matrix.build(
                new double[]{1, 0},
                new double[]{0, 1}
        );

        Matrix b = Matrix.build(
                new double[]{3, 6},
                new double[]{9, 11}
        );
        Matrix res = MatrixUtils.multi(a, b);
        System.out.println(res.dump());
    }

    @Test
    public void test3() {
        Vector3D vector3D = new Vector3D(1.0, 1.0, 1.0);
        Vector3D res = Vector3DUtils.rotate(vector3D, Math.PI / 2.0, 0, 0);
        System.out.println(res.getX() + "|" + res.getY() + "|" + res.getH());
    }
}