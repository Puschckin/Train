package oop;

public class Complex {

    private double re, im;

    Complex(double real, double imaginary) {
        this.re = real;
        this.im = imaginary;
    }
    // Методы, реализующие операции +, -, *
    public Complex add( Complex second) {
        return new Complex(this.re + second.re, this.im + second.im);
    }

    public Complex subtract(Complex second) {
        return new Complex( this.re - second.re, this.im - second.im);
    }

    public Complex multiply(Complex second) {
        return new Complex(this.re * second.re - this.im * second.im, this.re * second.im + this.im * second.re);
    }

    public String toString() {
        if(im >= 0){
            return re + " + " + im + "i";
        }else
            return re + " - " + -im + "i";
    }
}