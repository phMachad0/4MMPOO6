public class TestVector {
   public static void main(String[] args) {
    	// === 9.b     
      Vector v = new Vector(2);
      Rational a = new Rational(2, 3);
      Rational b = new Rational(3, 2);
      v.set(0, a);
      System.out.println("q9.b ; a = " + a);
      System.out.println("q9.b ; b = " + b);
      System.out.println("q9.b ; v = " + v);
      a.mult(b);
      System.out.println("q9.b ; after a.mult(b), a = " + a);
      System.out.println("q9.b ; after a.mult(b), b = " + b);
      System.out.println("q9.b ; after a.mult(b), v = " + v);       

      
      // === 9.d     
      v = new Vector(2);
      v.set(0, new Rational(1, 2));
      v.set(1, new Rational(1, 2));
      System.out.println("q9.b ; v = " + v);
      
      a = v.get(0);
      b = new Rational(1, 3);
      System.out.println("q9.d ; a = " + a);
      System.out.println("q9.d ; b = " + b);
      a.mult(b);
      //        b.mult(a);	// v unchanged
      System.out.println("q9.d ; after a.mult(b), v = " + v);
      
      
    	// === 10
      System.out.println("Qu.10");
      Vector v2 = new Vector(2);
      v2.set(0, new Rational(1, 2));
      v2.set(1, new Rational(1, 3));
      
      Rational r = new Rational(3, 4);
      System.out.print("v2 = " + v2 + "; r = " + r);
      v2.mult(r);
      System.out.println("; v2.mult(r) = " + v2);
      System.out.print("v = " + v + "; v2 = " + v2);
      v.add(v2);
      System.out.println(" ; v.add(v2) = " + v);    
   }
}
