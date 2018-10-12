package builder;

import data.Region;
import emum.RegionNames;

 public class RegionBuilder {

    protected Region region;

    public void createRegion() {
        region = new Region();
    }

    public void buildRegion() {
        region.setRegionNames(RegionNames.NEWREGION);
    }


     public Region getRegion(){
         return region;
     }



}


