package dualcalculator;

import java.util.Scanner;

class Calc {

    double a, b;
    Scanner sc = new Scanner(System.in);

    double addition() {
        System.out.println("Enter two numbers for addition");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a + b);
    }

    double subtraction() {
        System.out.println("Enter two numbers for subtraction");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a - b);
    }

    double multiplication() {
        System.out.println("Enter two numbers for multiplication");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a * b);
    }

    double division() {
        System.out.println("Enter two numbers for division");
        try {
            a = sc.nextInt();

            if ((b = sc.nextInt()) == 0) {
                throw new ArithmeticException();
            } else {
                return a / b;
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return (a / b);

    }

    double modulus() {
        System.out.println("Enter two numbers for modulus");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a % b);
    }

    void normal() {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        int choice = sc.nextInt();

        double ans = 0;
        switch (choice) {
            case 1:
                ans = addition();
                break;
            case 2:
                ans = subtraction();
                break;
            case 3:
                ans = multiplication();
                break;
            case 4:
                ans = division();
                break;
            case 5:
                ans = modulus();
                break;
            default:
                System.out.println("Wrong selection");
        }
        System.out.println("Answer = " + ans);
    }

    double power() {
        System.out.println("Enter two numbers for power");
        a = sc.nextInt();
        b = sc.nextInt();
        return (int) Math.pow(a, b);
    }

    double squareRoot() {
        System.out.println("Enter the number for sqquare root");
        a = sc.nextInt();

        return (int) Math.sqrt(a);
    }

    double round() {
        System.out.println("Enter number to roundup");
        a = sc.nextInt();

        return (int) Math.round(a);
    }

    double logarithm() {
        System.out.println("Enter number for logarithm");
        a = sc.nextInt();

        return Math.log(a);
    }

    double sine() {
        System.out.println("Enter number for sine");
        a = sc.nextInt();

        return Math.sin(a);
    }

    double cosine() {
        System.out.println("Enter number for sine");
        a = sc.nextInt();

        return Math.cos(a);
    }

    double tangent() {
        System.out.println("Enter number for tangent");
        a = sc.nextInt();
        return Math.tan(a);
    }

    void scientific() {
        System.out.println("1.Power");
        System.out.println("2.Square Root");
        System.out.println("3.Round");
        System.out.println("4.Logarithm");
        System.out.println("5.Sine");
        System.out.println("6.Cosine");
        System.out.println("7.Tangent");

        int choice = sc.nextInt();

        double ans = 0;
        switch (choice) {
            case 1:
                ans = power();
                break;
            case 2:
                ans = squareRoot();
                break;
            case 3:
                ans = round();
                break;
            case 4:
                ans = logarithm();
                break;
            case 5:
                ans = sine();
                break;
            case 6:
                ans = cosine();
                break;
            case 7:
                ans = tangent();
                break;
            default:
                System.out.println("Wrong selection");
        }
        System.out.println("Answer = " + ans);
    }
}

public class DualCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calc obj = new Calc();
        System.out.println("1.Normal Calculator");
        System.out.println("2.Scientific Calculator");
        System.out.println("Enter your choice of Calculator");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                obj.normal();
                break;
            case 2:
                obj.scientific();
                break;
            default:
                System.out.println("Wrong input!");
        }
    }

}
