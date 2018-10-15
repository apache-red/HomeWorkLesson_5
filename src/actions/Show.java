package actions;

import emum.AreaNames;
import emum.CountryNames;

public class Show {

    Write write= new Write();
    Filter filter = new Filter();


    public void showMainMenu(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Create a new country .");
        System.out.println("2. Show already created countries .");

        System.out.println("7. Stop program");
        System.out.println("------------------------------");
    }


    public void showCreateNewCountry(){


    }

    public void showAlreadyCreatedCountries(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Show general information by country .");
        System.out.println("7. previous menu .");
        System.out.println("------------------------------");
        choseAlreadyCreatedCountries(write.writeAction());

    }

    public void choseActionMainMenu(int number) {
        switch (number) {
            case 1:
                System.out.println("Available to add countries. Select country number to add");
                filter.showAllAvailableCountry();


                break;
            case 2:
                showAlreadyCreatedCountries();
                break;
        }
    showMainMenu();
    }

    public void choseAlreadyCreatedCountries(int number) {
        switch (number) {
            case 1:

                break;
            case 2:
                showMainMenu();
                break;
        }
       showAlreadyCreatedCountries();
    }






}
