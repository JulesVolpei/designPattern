package AbstractFactory;

public interface TelephoneAbstractFactory {

    // L'interface ne comporte qu'une méthode qui sera transmise à chacune des usines
    Telephone createTelephoneRouge();
    Telephone createTelephoneNoir();
}
