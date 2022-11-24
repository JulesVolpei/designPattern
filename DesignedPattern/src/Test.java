public class Test {
    public static void main(String[] args) {
        Telephone telephone1 = TelephoneFactory.createTelephone(new iPhoneFactory("SE", "IOS 16.1"));
        System.out.println(telephone1.getModele());
        System.out.println(telephone1.getSysteme());

        Telephone telephone2 = TelephoneFactory.createTelephone(new SamsungFactory("Galaxy S7", "Android 4.3"));

        System.out.println(telephone2.getModele());
        System.out.println(telephone2.getSysteme());
        if (telephone1 instanceof Telephone && telephone2 instanceof Telephone) {
            System.out.println("AAAAAAAAAAAAAhH");
        }
    }
}
