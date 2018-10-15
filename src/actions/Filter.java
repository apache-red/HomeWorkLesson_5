package actions;

import data.Country;
import data.Region;
import emum.AreaNames;
import emum.CountryNames;
import repository.Repo;

public class Filter {

    Write write = new Write();
    Repo repo = new Repo();



    public static void filterArea(Region region){
        for (int i = 0; i < AreaNames.values().length; i++) {
            if (AreaNames.values()[i].getArea().contains(region.toString()) ){
                System.out.print(AreaNames.values()[i] + " ");
                System.out.println(AreaNames.values()[i].getArea());
            }
        }
    }

//    public static int filter(Country country){
//        int number = 0;
//        for (int i = 0; i < AreaNames.values().length; i++) {
//            if (AreaNames.values()[i].getArea().contains(region.toString()) ){
//                System.out.print(AreaNames.values()[i] + " ");
//                System.out.println(AreaNames.values()[i].getArea());
//            }
//        }
//        return number;
//    }


    public void showAllAvailableCountry() {
        int number = 1;
        int actionNumber=0;
        for (int i = 0; i < CountryNames.values().length; i++) {
            System.out.println(number+". "+CountryNames.values()[i]);
        }
           actionNumber = write.writeAction();
       // repo.addCounty(CountryNames.values()[actionNumber]);


    }
}
