package ru.omsu.imit.kang.quadratic_polynomial;

public class QuadraticPolynomial {

    private double a,b,c;

    public QuadraticPolynomial(double a, double b, double c){
        if(a == 0){
            throw new IllegalArgumentException("a must be not zero");
        }
        this.a = a;this.b = b;this.c = c;
    }
    public double[] solve(){
        //TODO
        return null;
    }

}
