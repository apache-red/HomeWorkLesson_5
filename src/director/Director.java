package director;


import builder.*;
import data.Country;

public class Director {

    CountryBuilder builder;

    public void setCountryBuilder(CountryBuilder countryBuilder) {
        builder = countryBuilder;
    }

    public Country buildCountry() {
        builder.createCountry();
        builder.buildCountry();
        Country country = builder.getCountry();
        return country;
    }


}
