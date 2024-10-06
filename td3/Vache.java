public class Vache extends Animal {
    private int taches;

    public Vache(String nom, int poids, int taches) {
        super(nom, poids);
        this.taches = taches;
    }

    public int getTaches() {
        return this.taches;
    }

    @Override
    public void crier() {
        System.out.println(nom + " crie... La vache à " + this.taches +" taches qui tache, crie... il meugle");
    }

    @Override
    public String toString() {
        return this.nom + " with " + this.poids;
    }

    @Override
    public int calculerPrixNourriture() {
        return regime.getPrixAuKilogramme()*this.poids;
    }
}
