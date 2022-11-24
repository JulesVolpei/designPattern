public class Samsung extends Telephone {
    private String modele;
    private String systeme;

    public Samsung(String modele, String systeme) {
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
}
