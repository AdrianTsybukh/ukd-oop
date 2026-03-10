public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException("Denominator cant be zero.");
        }

        if(denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Fraction addition(Fraction other) {
        checkNotNull(other);
        int num = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction subtraction(Fraction other) {
        checkNotNull(other);
        int num = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction multiplication(Fraction other) {
        checkNotNull(other);
        int newNum = this.numerator * other.numerator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction division(Fraction other) {
        checkNotNull(other);
        if (other.numerator == 0) {
            throw new ArithmeticException("Zero division.");
        }
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }

    private void checkNotNull(Fraction other) {
        if (other == null) {
            throw new IllegalArgumentException("Fraction object cant be null.");
        }
    }

    @Override
    public String toString() {
        return String.format("%d|%d", numerator, denominator);
    }
}
