package AbstractFactory;

public class iPhoneRouge extends iPhone{
    private String couleur = "Rouge";
    public iPhoneRouge(String modele, String systeme) {
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
