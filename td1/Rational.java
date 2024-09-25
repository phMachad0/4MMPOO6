public class Rational {
    int num;
    int denom;

    public Rational(int num, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = num;
        this.denom = denom;
    }
    
    public String toString() {
        return num + " / " + denom;
    }

    public void mult(Rational multiplicateur) {
        num *= multiplicateur.num;
        denom *= multiplicateur.denom;
        this.ReducedRational();
    }

    public static Rational mult(Rational a, Rational b) {
        Rational result = new Rational(a.num * b.num, a.denom * b.denom);
        result.ReducedRational();
        return result;
    }

    public void add(Rational addend) {
        num = num * addend.denom + addend.num * denom;
        denom *= addend.denom;
        this.ReducedRational();
    }

    private void ReducedRational() {
        int a = num;
        int b = denom;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        num /= a;
        denom /= a;
    }

    public double toDouble() {
        return (double) num / denom;
    }
}
