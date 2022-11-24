public class Client {
    public static void main(String[] args) {
        System.out.println(Serveur.livrerPlat(TypePlat.PIZZA));
        System.out.println(Serveur.livrerPlat(TypePlat.BURGER));
        System.out.println(Serveur.livrerPlat(TypePlat.PATE));
    }
}
