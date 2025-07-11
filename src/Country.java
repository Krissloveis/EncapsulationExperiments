public class Country {

    private String name;
    private int population;
    private double area;
    private String capital;
    private boolean hasSeaAccess;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isHasSeaAccess() {
        return hasSeaAccess;
    }

    public void setHasSeaAccess(boolean hasSeaAccess) {
        this.hasSeaAccess = hasSeaAccess;
    }
}


