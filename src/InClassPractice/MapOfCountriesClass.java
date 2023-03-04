package InClassPractice;

public class MapOfCountriesClass {
    String countryName;
    String capitalName;

    public MapOfCountriesClass(String countryName, String capitalName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
    }

    String getValues(String capitalName) {
        return capitalName;

    }

    String getKeys(String countryName) {
        return countryName;
    }

    @Override
    public String toString() {
        return "MapOfCountriesClass{" +
                "countryName='" + countryName + '\'' +
                ", capitalName='" + capitalName + '\'' +
                '}';
    }
}
