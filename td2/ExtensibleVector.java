import java.util.ArrayList;

public class ExtensibleVector {
    public ArrayList<Rational> rationals;
    
    public ExtensibleVector() {
        this.rationals = new ArrayList<>();;
    }

    public static void main(String[] args) {
        ExtensibleVector eV = new ExtensibleVector();
        Rational r = new Rational(1, 2);
        Rational r2 = new Rational(4, 7);
        eV.append(r);
        eV.append(r2);
        System.out.println("v1: " + eV.toString());
        System.out.println("v1[0]: " + eV.get(0));
        System.out.println("Dimension: " + eV.getDimension());
    }

    public void append(Rational r) {
        this.rationals.add(r);
    }

    public int getDimension() {
        return this.rationals.size();
    }

    public Rational get(int i) {
        return this.rationals.get(i);
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
}
