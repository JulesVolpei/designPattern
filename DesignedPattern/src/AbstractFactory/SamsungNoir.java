package AbstractFactory;

public class SamsungNoir extends Samsung{
    private String couleur = "Noir";
    public SamsungNoir(String modele, String systeme) {
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
