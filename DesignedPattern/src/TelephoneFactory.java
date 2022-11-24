public class TelephoneFactory {

    public static Telephone createTelephone(TelephoneAbstractFactory factory) {
        // Appel de la méthode createTelephone() afin de pouvoir créer l'objet à partir de sa factory
        return factory.createTelephone();
    }
}
