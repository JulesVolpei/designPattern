package AbstractFactory;

public class iPhoneNoir extends iPhone{
    private String modele;
    private String systeme;
    private String couleur = "Noir";
    public iPhoneNoir(String modele, String systeme) {
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
