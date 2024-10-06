public class Animal {
    protected int poids;
    protected String nom;
    protected Regime regime;

    public Animal(String nom, int poids, Regime regime) {
        this.nom = nom;
        this.poids = poids;
        this.regime = regime;
    }

    public Animal(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    
    public int getPoids() {
        return this.poids;
    }
    
    public int calculerPrixNourriture() {
        return this.regime.getPrixAuKilogramme();
    }

    public String getNom() {
        return this.nom;
    }
    
    public void crier() {
        System.out.println(nom + " crie...");
    }
    @Override
    public String toString() {
        return this.nom + " with " + this.poids;
    }
}
