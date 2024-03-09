package Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor with parameters
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Method to simplify the fraction
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Method to calculate the greatest common divisor
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Method to add two fractions
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to add a fraction and an integer
    public Fraction add(int number) {
        return add(new Fraction(number, 1));
    }

    // Method to subtract two fractions
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to subtract an integer from a fraction
    public Fraction subtract(int number) {
        return subtract(new Fraction(number, 1));
    }

    // Method to multiply two fractions
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to multiply a fraction by an integer
    public Fraction multiply(int number) {
        return multiply(new Fraction(number, 1));
    }

    // Method to divide two fractions
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to divide a fraction by an integer
    public Fraction divide(int number) {
        return divide(new Fraction(number, 1));
    }

    // Method to represent the fraction as a string
    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }
}

