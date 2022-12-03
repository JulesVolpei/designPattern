package AbstractFactory;

public class SamsungFactory implements TelephoneAbstractFactory {
    private String modele;
    private String systeme;

    public SamsungFactory(String modele, String systeme) {
        this.modele = modele;
        this.systeme = systeme;
    }

    @Override
    public Telephone createTelephoneRouge() {
        return new SamsungRouge(modele, systeme);
    }

    @Override
    public Telephone createTelephoneNoir() {
        return new SamsungNoir(modele, systeme);
    }
}
