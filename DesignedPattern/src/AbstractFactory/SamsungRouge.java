package AbstractFactory;

public class SamsungRouge extends Samsung{
    private String couleur = "Rouge";
    private String modele;
    private String systeme;

    public SamsungRouge(String modele, String systeme) {
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
