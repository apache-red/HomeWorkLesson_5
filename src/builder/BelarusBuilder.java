package builder;

import data.Country;
import emum.CountryNames;

public class BelarusBuilder extends CountryBuilder {


    @Override
   public void buildCountry() {
        country.setCountryNames(CountryNames.BELARUS);
    }
}
