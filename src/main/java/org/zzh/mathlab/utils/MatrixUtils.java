package org.zzh.mathlab.utils;

import org.apache.commons.math3.util.FastMath;
import org.zzh.mathlab.tools.Matrix;
import org.zzh.mathlab.tools.Vector3D;

import static org.zzh.mathlab.exception.ErrorConstant.MATRIX_SHAPE_NOT_MATCH;

public class MatrixUtils {
    private MatrixUtils() {
    }

    /**
     * 矩阵间乘法
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix multi(Matrix a, Matrix b) {
        if (a.getCol() != b.getRow()) {
            throw MATRIX_SHAPE_NOT_MATCH;
        }
        Matrix ret = new Matrix(a.getRow(), b.getCol());
        for (int i = 0; i < a.getRow(); i++) {
            for (int j = 0; j < b.getCol(); j++) {
                for (int k = 0; k < a.getCol(); k++) {
                    ret.set(i, j, ret.get(i, j) + a.get(i, j) * b.get(k, j));
                }
            }

        }
        return ret;
    }

    /**
     * 矩阵按位乘法
     *
     * @param a
     * @param b
     * @return
     */
    public static Matrix dotMulti(Matrix a, Matrix b) {
        if (a.getCol() != b.getCol() || a.getRow() != b.getRow()) {
            throw MATRIX_SHAPE_NOT_MATCH;
        }
        Matrix res = new Matrix(a.getRow(), a.getCol());
        // 按位乘法
        for (int i = 0; i < a.getRow(); i++) {
            for (int j = 0; j < a.getCol(); j++) {
                res.set(i, j, a.get(i, j) * b.get(i, j));
            }
        }
        return res;
    }

    /**
     * 求矩阵的转置
     *
     * @param a
     * @return
     */
    public static Matrix transpose(Matrix a) {
        Matrix ret = new Matrix(a.getCol(), a.getRow());
        for (int i = 0; i < a.getRow(); i++) {
            for (int j = 0; j < a.getCol(); j++) {
                ret.set(j, i, a.get(i, j));
            }
        }
        return ret;
    }

    /**
     * 矩阵转向量
     *
     * @param matrix
     * @return
     */
    public static Vector3D toVector(Matrix matrix) {
        if (matrix.getRow() != 1 || matrix.getCol() != 3) {
            throw MATRIX_SHAPE_NOT_MATCH;
        }
        return new Vector3D(matrix.get(0, 0),
                matrix.get(0, 1),
                matrix.get(0, 2));
    }

    /**
     * yz 平面顺时针旋转矩阵
     *
     * @param theta 弧度制角度
     * @return
     */
    public static Matrix rotateYZ(double theta) {
        return Matrix.build(
                new double[]{1, 0, 0},
                new double[]{0, FastMath.cos(theta), -FastMath.sin(theta)},
                new double[]{0, FastMath.sin(theta), FastMath.cos(theta)}
        );
    }


    public static Matrix rotateXZ(double theta) {
        return Matrix.build(
                new double[]{FastMath.cos(theta), 0, FastMath.sin(theta)},
                new double[]{0, 1, 0},
                new double[]{-FastMath.sin(theta), 0, FastMath.cos(theta)}
        );
    }


    public static Matrix rotateXY(double theta) {
        return Matrix.build(
                new double[]{FastMath.cos(theta), -FastMath.sin(theta), 0},
                new double[]{FastMath.sin(theta), FastMath.cos(theta), 0},
                new double[]{0, 0, 1}
        );
    }
}
