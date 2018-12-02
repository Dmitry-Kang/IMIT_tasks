package ru.omsu.imit.kang.other_tasks;

import ru.omsu.imit.kang.quadratic_polynomial.QuadraticPolynomial;

public class PolynomialProcessor {
    private QuadraticPolynomial a;

    public PolynomialProcessor(QuadraticPolynomial a) {
        this.a = a;
    }
    public double getMaxRoot() throws PolynomialProcessorException{
        double[] roots = a.solve();
        if(roots.length == 0){
            throw new PolynomialProcessorException("No roots");
        }
        return Math.max(roots[0], roots[1]);
    }
}
