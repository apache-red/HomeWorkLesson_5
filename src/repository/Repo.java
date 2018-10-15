package repository;

import data.Area;
import data.City;
import data.Country;
import data.Region;

import java.util.ArrayList;

public class Repo {

   public ArrayList<Country> countryList = new <Country>ArrayList();
   public ArrayList<Region> regionList = new <Region>ArrayList();
   public ArrayList<Area> areaList = new <Area>ArrayList();
   public ArrayList<City> cityList = new <City>ArrayList();


   public void addCounty(Country country){
      countryList.add(country);
   }

}
