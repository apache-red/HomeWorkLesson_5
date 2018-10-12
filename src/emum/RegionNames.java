package emum;


import static emum.CountryNames.BELARUS;
import static emum.CountryNames.RUSSIAN_FEDERATION;

public enum RegionNames {

    BREST(BELARUS), GOMEL(BELARUS), GRODNO(BELARUS), MOGILEV(BELARUS),
    MINSK(BELARUS), VITEBSK(BELARUS), BRYANS(RUSSIAN_FEDERATION), NEWREGION();



    private String country;

    RegionNames(CountryNames countryNames) {
        country=  countryNames.toString();
    }
    RegionNames() {
    }



    public String getCountry() {
        return country;
    }


}
