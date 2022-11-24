public class Serveur {

    public static String livrerPlat(TypePlat typePlat){
        switch(typePlat){
            case PIZZA:
                Burger burger = new Burger();
                return burger.NourriturePrete();
            case BURGER:
                Pizza pizza = new Pizza();
                return pizza.NourriturePrete();
            case PATE:
                Pate pate = new Pate();
                return pate.NourriturePrete();
        }
        return null;
    }
}
