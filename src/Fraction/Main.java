package Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);

        System.out.println("Addition: " + fraction1.add(fraction2));
        System.out.println("Subtraction: " + fraction1.subtract(fraction2));
        System.out.println("Multiplication: " + fraction1.multiply(fraction2));
        System.out.println("Division: " + fraction1.divide(fraction2));

        // Operations with integers
        System.out.println("Fraction 1 + 2: " + fraction1.add(2));
        System.out.println("Fraction 2 * 3: " + fraction2.multiply(3));
    }
}

