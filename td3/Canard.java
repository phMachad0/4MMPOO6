public class Canard extends Animal {
    private String couleur;
    static Regime regime = new Regime("fruits secs", 300);
    
    public Canard(String nom, int poids, String couleur) {
        super(nom, poids, regime);
        this.couleur = couleur;
    }

    public String getCouleurPlumes() {
        return this.couleur;
    }

    @Override
    public void crier() {
        System.out.println(nom + " crie... Ce canard de " + this.poids +"kg aux belles plumes " + this.couleur);
    }

    @Override
    public String toString() {
        return this.nom + " with " + this.poids;
    }

    @Override
    public int calculerPrixNourriture() {
        return regime.getPrixAuKilogramme()*1;
    }
}
