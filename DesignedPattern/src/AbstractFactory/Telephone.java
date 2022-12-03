package AbstractFactory;

public abstract class Telephone {

    public abstract String getModele();
    public abstract String getSysteme();

    public abstract String getCouleur();

    @Override
    public String toString() {
        return "Modèle = " + this.getModele() + ", système = " + this.getSysteme() + ", couleur = " + this.getCouleur();
    }
}
