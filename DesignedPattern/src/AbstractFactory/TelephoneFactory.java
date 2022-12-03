package AbstractFactory;

public class TelephoneFactory {

    public static Telephone createTelephoneRouge(TelephoneAbstractFactory factory) {
        // Appel de la méthode createTelephone() afin de pouvoir créer l'objet à partir de sa factory
        return factory.createTelephoneRouge();
    }

    public static Telephone createTelephoneNoir(TelephoneAbstractFactory factory) {
        return factory.createTelephoneNoir();
    }
}
