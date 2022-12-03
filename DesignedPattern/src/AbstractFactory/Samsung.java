package AbstractFactory;

public abstract class Samsung extends Telephone {
    private String modele;
    private String systeme;

    private String couleur;
    @Override
    public abstract String getModele();

    @Override
    public abstract String getSysteme();

    public abstract String getCouleur();
}
