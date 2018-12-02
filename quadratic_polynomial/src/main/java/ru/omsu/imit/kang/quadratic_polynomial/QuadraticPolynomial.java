package ru.omsu.imit.kang.quadratic_polynomial;

public class QuadraticPolynomial {

    private double a,b,c;

    public QuadraticPolynomial(double a, double b, double c){
        if(a == 0){
            throw new IllegalArgumentException("First argument must be not zero");
        }
        this.a = a; this.b = b; this.c = c;
    }
    public double[] solve(){
        double diskriminant = b*b - 4*a*c;
        if (diskriminant < 0){
            return new double[0];
        }
        return new double[]{(-b+Math.sqrt(diskriminant))/(2*a),(-b-Math.sqrt(diskriminant))/(2*a)};
    }

}
