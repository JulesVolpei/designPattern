package AbstractFactory;

public class SamsungRouge extends Samsung{
    private String couleur = "Rouge";
    public SamsungRouge(String modele, String systeme) {
        super(modele, systeme);
    }

    @Override
    public String getModele() {
        return super.getModele();
    }

    @Override
    public String getSysteme() {
        return super.getSysteme();
    }

    public String getCouleur() {
        return couleur;
    }
}
