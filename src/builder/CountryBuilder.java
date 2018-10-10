package builder;

import data.Country;



abstract public class CountryBuilder {

    protected Country country;

    public void createCountry() {
        country = new Country();
    }

    abstract public void buildCountry();


    public Country getCountry(){
        return country;
    }
}
