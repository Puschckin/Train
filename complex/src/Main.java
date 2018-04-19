package oop;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
     public static Complex addComplex(){
        return  new Complex(in.nextDouble(), in.nextDouble());
    }
    public static void main(String[] args) {
        Boolean k = true;
        while (k) {
            System.out.println("1: Введите два комплексных числа");
            System.out.println("2: Выход");
        String command = in.next();
        switch (command) {
            case "1":
                System.out.println("Введите действительную и мнимую часть первого числа ");
                Complex first = addComplex();
                System.out.println("Введите действительную и мнимую часть второго числа ");
                Complex second = addComplex();
                System.out.println("Complex a = " + first.toString());
                System.out.println("Complex b = " + second.toString());
                Complex add = first.add(second);
                System.out.println("Complex a + b = " + add.toString());
                Complex subtract = first.subtract(second);
                System.out.println("Complex a - b = " + subtract.toString());
                Complex multiply = first.multiply(second);
                System.out.println("Complex a * b = " + multiply.toString());
                break;
            case "2":
                k = false;
                break;
        }

        }
    }



}
