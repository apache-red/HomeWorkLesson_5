package start;
import builder.BelarusBuilder;
import builder.CountryBuilder;
import builder.RegionBuilder;
import data.Country;
import data.Region;
import director.Director;
import emum.AreaNames;
import emum.RegionNames;

public class Main {

    public static void main(String[] args) {

//        CountryBuilder countryBuilder = new BelarusBuilder();
//        Director director = new Director();

        Director director = new Director();
        director.setCountryBuilder(new BelarusBuilder());
        Country country = director.buildCountry();
        System.out.println(country);
       director.setRegionBuilder(new RegionBuilder());
       Region region = director.buildRegion();
       region.setRegionNames(RegionNames.VITEBSK);

        filterArea(region);
//        region.setRegionNames(RegionNames.VITEBSK);
//        System.out.println(region);
//        filterArea(region);
    }


    public static void filterArea(Region region){
        System.out.println(region);
        for (int i = 0; i < AreaNames.values().length; i++) {

            if (AreaNames.values()[i].getArea().contains(region.toString()) ){
                System.out.print(AreaNames.values()[i] + " ");
                System.out.println(AreaNames.values()[i].getArea());
            }

        }
    }

}
