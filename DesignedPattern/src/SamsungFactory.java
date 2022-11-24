public class SamsungFactory implements TelephoneAbstractFactory {
    private String modele;
    private String systeme;

    public SamsungFactory(String modele, String systeme) {
        this.modele = modele;
        this.systeme = systeme;
    }

    @Override
    public Telephone createTelephone() {
        return new Samsung(modele, systeme);
    }
}
