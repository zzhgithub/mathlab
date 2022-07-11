package org.zzh.mathlab.tools;

import org.apache.commons.lang3.ArrayUtils;

import java.io.Serializable;

public class Matrix implements Serializable {

    int row; // 行数
    int col; // 列数

    double[][] matrix;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new double[row][col];
    }

    /**
     * 快捷创建矩阵
     *
     * @param tables
     * @return
     */
    public static Matrix build(double[]... tables) {
        if (ArrayUtils.isEmpty(tables)) {
            return null;
        }

        Matrix matrix = new Matrix(tables.length, tables[0].length);
        for (int i = 0; i < tables.length; i++) {
            for (int i1 = 0; i1 < tables[i].length; i1++) {
                matrix.set(i, i1, tables[i][i1]);
            }
        }
        return matrix;
    }

    /**
     * 设置值
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, Double value) {
        this.matrix[row][col] = value;
    }

    /**
     * 获取值
     *
     * @param row
     * @param col
     * @return
     */
    public Double get(int row, int col) {
        if (row < this.matrix.length) {
            double[] matrix1 = this.matrix[row];
            if (col < matrix1.length) {
                return matrix1[col];
            }
        }
        return null;
    }


    public String dump() {
        StringBuilder builder = new StringBuilder();
        builder.append("[\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                builder.append(get(i, i1));
                builder.append("\t");
            }
            builder.append("\n");
        }
        builder.append("]\n");
        return builder.toString();
    }
}