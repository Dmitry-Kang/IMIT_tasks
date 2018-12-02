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
        double Diskriminant = b*b - 4*a*c;
        if (Diskriminant < 0){
            throw new IllegalArgumentException("Discriminant < 0");
        }
        double[] res = {(-b+Math.sqrt(Diskriminant))/(2*a),(-b-Math.sqrt(Diskriminant))/(2*a)};
        return res;
    }

}
