import java.util.LinkedList;

class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    // fais crier tous les animaux. Bonjour l'ambiance...
    public void crier() {
        System.out.println("*** 1, 2, 3 crions:");
        for (Animal a : animaux) {
            a.crier();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le zoo " + nom + " contient " + getNbAnimaux() + " animaux:");
        sb.append(animaux.toString());
        return sb.toString();

        // alternative:
        // return "le zoo " + nom + "contient:" + animaux;
    }

    public int calculerCouteTotal() {
        int couteTotal = 0;
        for (Animal a : animaux) {
            couteTotal =+ a.calculerPrixNourriture();
        }
        return couteTotal;
    }

    public static void main(String[] args){
        Zoo ensimag = new Zoo("ensimag");
        
        Vache marie = new Vache("Marie", 50, 100);
        Vache matthieu = new Vache("Matthieu", 60, 200);
        Canard akram = new Canard("Akram", 70, "black");
        Vache thang = new Vache("Thang", 80, 300);
        Canard karine = new Canard("Karine", 90, "white");
        Vache nicolas = new Vache("Nicolas", 100, 400);
        Canard djamel = new Canard("Djamel", 110, "red");
        
        ensimag.ajouteAnimal(marie);
        ensimag.ajouteAnimal(matthieu);
        ensimag.ajouteAnimal(akram);
        ensimag.ajouteAnimal(thang);
        ensimag.ajouteAnimal(karine);
        ensimag.ajouteAnimal(nicolas);
        ensimag.ajouteAnimal(djamel);
        
        ensimag.crier();
    }
}
