public class Vector {
    public int dimension;
    public Rational[] rationals;

    public Vector(int dimension) {
        this.dimension = dimension;
        this.rationals = new Rational[dimension];
        for (int i = 0; i < dimension; i++) {
            rationals[i] = new Rational(0, 1);
        }
    }

    public void set(int i, Rational r) {
        if (i >= dimension) {
            throw new IllegalArgumentException("i > dimension");
        }
        this.rationals[i] = r;
    }

    public Rational get(int i) {
        if (i >= dimension) {
            throw new IllegalArgumentException("i > dimension");
        }
        return this.rationals[i];
    }

    @Override
    public String toString() {
        String string = "";
        string += "( ";
        for (Rational rational : rationals) {
            string += rational.toString() + ", ";
        }
        string = (string.substring(0, string.length() - 2));
        string += " )";
        return string;
    }

    public void mult(Rational r) {
        for (Rational rational : rationals) {
            rational.mult(r);
        }
    }

    public void add(Vector v) {
        if (v.dimension != this.dimension) {
            throw new IllegalArgumentException("Different dimensions");
        }

        for (int i = 0; i < dimension; i++) {
            this.rationals[i].add(v.get(i));
        }
    }
}