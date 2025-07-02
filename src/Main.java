public class Main {
    public static void main(String[] args) {
        Country country = new Country("Малайзия");

        System.out.println("Страна: " + country.getName());
        System.out.println("Столица: " + country.getCapital());
        country.setPopulation(32763726);
        country.setArea(329758);
        country.setCapital("Куала-Лумпур");
        country.setHasSeaAccess(true);

    }
}
