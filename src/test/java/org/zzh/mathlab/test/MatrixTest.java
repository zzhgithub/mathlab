package org.zzh.mathlab.test;

import junit.framework.TestCase;
import org.junit.Test;
import org.zzh.mathlab.tools.Matrix;


public class MatrixTest extends TestCase {

    @Test
    public void test() {
        Matrix build = Matrix.build(
                new double[]{1.0, 2.2},
                new double[]{0.0, 2.5}
        );
        System.out.println("--");
    }
}