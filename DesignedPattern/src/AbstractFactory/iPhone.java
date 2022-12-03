package AbstractFactory;

public abstract class iPhone extends Telephone{
    private String modele;
    private String systeme;

    private String couleur;

    @Override
    public abstract String getModele();

    @Override
    public abstract String getSysteme();

    @Override
    public abstract String getCouleur();


}
