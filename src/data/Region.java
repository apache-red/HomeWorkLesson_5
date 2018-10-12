package data;


import emum.*;

public class Region {

    private RegionNames regionNames;


    public void setRegionNames(RegionNames regionNames){ this.regionNames = regionNames;}


    @Override
    public String toString() {
        return  ""+regionNames ;
    }
}
