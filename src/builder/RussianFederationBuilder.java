package builder;

import emum.CountryNames;

public class RussianFederationBuilder extends CountryBuilder{

    @Override
    public void buildCountry() {
        country.setCountryNames(CountryNames.RUSSIAN_FEDERATION);
    }
}
