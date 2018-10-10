package data;

import emum.*;
import builder.*;


public class Country  {

    private CountryNames countryNames;
    private RegionNames regionNames;


public void setCountryNames(CountryNames countryNames){ this.countryNames = countryNames;}
public void setRegionNames(RegionNames regionNames){ this.regionNames= regionNames;}


    @Override
    public String toString() {
        return "Country{" +
                "countryNames=" + countryNames +
                ", regionNames=" + regionNames +
                '}';
    }
}
