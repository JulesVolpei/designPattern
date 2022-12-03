package AbstractFactory;

public class iPhoneFactory implements TelephoneAbstractFactory{
    private String modele;
    private String systeme;

    public iPhoneFactory(String modele, String systeme) {
        this.modele = modele;
        this.systeme = systeme;
    }

    @Override
    public Telephone createTelephone() {
        // Instancie un nouvel AbstractFactory.iPhone
        return new iPhone(modele, systeme);
    }
}
