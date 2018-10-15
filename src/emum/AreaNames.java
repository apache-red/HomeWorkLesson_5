package emum;

public enum AreaNames {
    BARANOVICHSKIJ(RegionNames.BREST, CountryNames.BELARUS), BERJOZOVSKIJ(RegionNames.BREST, CountryNames.BELARUS),BRESTSKIJ(RegionNames.BREST, CountryNames.BELARUS),
    GANCEVICHSKIJ(RegionNames.BREST, CountryNames.BELARUS),  DROGICHINSKIJ(RegionNames.BREST, CountryNames.BELARUS), ZHABINKOVSKIJ(RegionNames.BREST, CountryNames.BELARUS),
    IVANOVSKIJ(RegionNames.BREST, CountryNames.BELARUS), IVACEVICHSKIJ(RegionNames.BREST, CountryNames.BELARUS), KAMENECKIJ(RegionNames.BREST, CountryNames.BELARUS),
    KOBRINSKIJ(RegionNames.BREST, CountryNames.BELARUS), LUNINECKIJ(RegionNames.BREST, CountryNames.BELARUS), LJAHOVICHSKIJ(RegionNames.BREST, CountryNames.BELARUS),
    MALORITSKIJ(RegionNames.BREST, CountryNames.BELARUS), PINSKIJ(RegionNames.BREST, CountryNames.BELARUS), PRUZHANSKIJ(RegionNames.BREST, CountryNames.BELARUS),
    STOLINSKIJ(RegionNames.BREST, CountryNames.BELARUS),
    MAXBREST(RegionNames.BREST, CountryNames.BELARUS),
    BESHENKOVICHSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), BRASLAVSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), VERHNEDVINSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    VITEBSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), GLUBOKSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), GORODOKSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    DOKSHICKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), DUBROVENSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), LEPELSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    LIOZNENSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), MIORSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), ORSHANSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    POLOCKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), POSTAVSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), ROSSONSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    SENNENSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), TOLOCHINSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), USHACHSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    CHASHNIKSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), SHARKOVSHHINSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS), SHUMILINSKIJ(RegionNames.VITEBSK, CountryNames.BELARUS),
    MAXVITEBSK(RegionNames.VITEBSK, CountryNames.BELARUS);


    private String area;

    AreaNames(RegionNames regionNames, CountryNames countryNames) {
        area=  regionNames.toString();
    }

    public String getArea() {
        return area;
    }
}
