package ru.omsu.imit.kang.other_tasks;

import org.junit.Test;
import ru.omsu.imit.kang.quadratic_polynomial.QuadraticPolynomial;

import static org.junit.Assert.*;

public class PolynomialProcessorTest {

    @Test(expected = PolynomialProcessorException.class)
    public void getMaxRootNoRoots() throws PolynomialProcessorException {
        QuadraticPolynomial p = new QuadraticPolynomial(2,2,1);
        PolynomialProcessor a = new PolynomialProcessor(p);
        a.getMaxRoot();
    }

    @Test
    public void getMaxRootEqualRoots() throws Exception{
        QuadraticPolynomial p = new QuadraticPolynomial(1,2,1);
        PolynomialProcessor a = new PolynomialProcessor(p);
        assertEquals(-1, a.getMaxRoot(), 1e-9);
    }

    @Test
    public void getMaxRoot() throws Exception {
        QuadraticPolynomial p = new QuadraticPolynomial(1,2,0);
        PolynomialProcessor a = new PolynomialProcessor(p);
        assertEquals(0, a.getMaxRoot(), 1e-9);
    }
}

