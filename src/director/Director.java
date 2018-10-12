package director;


import builder.*;
import data.Country;
import data.Region;

public class Director {

    CountryBuilder countryBuilder;
    RegionBuilder regionBuilder;

    public void setCountryBuilder(CountryBuilder countryBuilder) {
        this.countryBuilder = countryBuilder;
    }

    public void setRegionBuilder(RegionBuilder regionBuilder) {
        this.regionBuilder = regionBuilder;
    }

    public Country buildCountry() {
        countryBuilder.createCountry();
        countryBuilder.buildCountry();
        Country country = countryBuilder.getCountry();
        return country;
    }

    public Region buildRegion() {
       regionBuilder.createRegion();
       regionBuilder.buildRegion();
        Region region =regionBuilder.getRegion();
        return region;
    }
}
