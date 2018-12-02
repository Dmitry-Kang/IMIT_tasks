package ru.omsu.imit.kang.quadratic_polynomial;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticPolynomialTest {

    @Test
    public void solve() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,2,1);
        double[] b = {-1,-1};
        assertArrayEquals(b, a.solve(), 1e-9);
    }
}