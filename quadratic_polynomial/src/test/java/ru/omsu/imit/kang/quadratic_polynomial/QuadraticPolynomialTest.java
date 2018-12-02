package ru.omsu.imit.kang.quadratic_polynomial;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticPolynomialTest {
    @Test(expected = IllegalArgumentException.class)
    public void constructNotQuadratic(){
        new QuadraticPolynomial(0,1,2);
    }

    @Test
    public void solveEqualRoots() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,2,1);
        double[] b = {-1,-1};
        assertArrayEquals(b, a.solve(), 1e-9);
    }

    @Test
    public void solveNoRoots() {
        QuadraticPolynomial a = new QuadraticPolynomial(2,2,1);
        assertEquals(0, a.solve().length);
    }

    @Test
    public void solve() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,2,0);
        double[] b = {0,-2};
        assertArrayEquals(b, a.solve(), 1e-9);
    }
}