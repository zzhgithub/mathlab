package org.zzh.mathlab.utils;

import org.zzh.mathlab.tools.Matrix;

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
}
