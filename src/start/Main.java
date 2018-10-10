package start;
import builder.BelarusBuilder;
import builder.CountryBuilder;
import data.Country;
import director.Director;

public class Main {

    public static void main(String[] args) {

//        CountryBuilder countryBuilder = new BelarusBuilder();
//        Director director = new Director();

        Director director = new Director();
        director.setCountryBuilder(new BelarusBuilder());
        Country country = director.buildCountry();
        System.out.println(country);



//        CarBuilder builder = new SubaruBuilder(); // new FordMondeoBuilder();
//        Director director = New Director(builder);
//        director.BuildCar();
//        Car car = buider.getCar();﻿




    }
}
