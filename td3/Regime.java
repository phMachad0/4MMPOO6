public class Regime {
    public String nom;
    public int prixAuKilogramme;

    public Regime(String nom, int prixAuKilogramme) {
        this.nom = nom;
        this.prixAuKilogramme = prixAuKilogramme;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPrixAuKilogramme() {
        return this.prixAuKilogramme;
    }

}
