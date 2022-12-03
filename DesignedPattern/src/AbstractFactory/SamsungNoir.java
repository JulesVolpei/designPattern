package AbstractFactory;

public class SamsungNoir extends Samsung{
    private String couleur = "Noir";
    private String modele;
    private String systeme;
    public SamsungNoir(String modele, String systeme) {
        this.modele = modele;
        this.systeme = systeme;
    }

    @Override
    public String getModele() {
        return modele;
    }

    @Override
    public String getSysteme() {
        return systeme;
    }

    @Override
    public String getCouleur() {
        return couleur;
    }
}
