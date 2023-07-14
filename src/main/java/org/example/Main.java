package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (isTriangle(A,B,C))
            System.out.println("Perimetro = "+perimeter(A,B,C));
        else
            System.out.println("Area = "+area(A,B,C));
    }

    public static boolean isTriangle(double a, double b , double c){
        if ((a + b > c) && (a + c > b) && (c + b > a))
            return true;
        else
            return false;
    }
    public static double perimeter(double a, double b , double c){
        return a + b + c;
    }
    public static double area(double a, double b , double c){
        return (a + b)/2*c;
    }
}