package AbstractFactory;

public class iPhoneNoir extends iPhone{
    private String couleur = "Noir";
    public iPhoneNoir(String modele, String systeme) {
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
