package emum;

public enum AreaNames {
    BARANOVICHSKIJ(RegionNames.BREST), BERJOZOVSKIJ(RegionNames.BREST),BRESTSKIJ(RegionNames.BREST),
    GANCEVICHSKIJ(RegionNames.BREST),  DROGICHINSKIJ(RegionNames.BREST), ZHABINKOVSKIJ(RegionNames.BREST),
    IVANOVSKIJ(RegionNames.BREST), IVACEVICHSKIJ(RegionNames.BREST), KAMENECKIJ(RegionNames.BREST),
    KOBRINSKIJ(RegionNames.BREST), LUNINECKIJ(RegionNames.BREST), LJAHOVICHSKIJ(RegionNames.BREST),
    MALORITSKIJ(RegionNames.BREST), PINSKIJ(RegionNames.BREST), PRUZHANSKIJ(RegionNames.BREST),
    STOLINSKIJ(RegionNames.BREST),
    MAXBREST(RegionNames.BREST),
    BESHENKOVICHSKIJ(RegionNames.VITEBSK), BRASLAVSKIJ(RegionNames.VITEBSK), VERHNEDVINSKIJ(RegionNames.VITEBSK),
    VITEBSKIJ(RegionNames.VITEBSK), GLUBOKSKIJ(RegionNames.VITEBSK), GORODOKSKIJ(RegionNames.VITEBSK),
    DOKSHICKIJ(RegionNames.VITEBSK), DUBROVENSKIJ(RegionNames.VITEBSK), LEPELSKIJ(RegionNames.VITEBSK),
    LIOZNENSKIJ(RegionNames.VITEBSK), MIORSKIJ(RegionNames.VITEBSK), ORSHANSKIJ(RegionNames.VITEBSK),
    POLOCKIJ(RegionNames.VITEBSK), POSTAVSKIJ(RegionNames.VITEBSK), ROSSONSKIJ(RegionNames.VITEBSK),
    SENNENSKIJ(RegionNames.VITEBSK), TOLOCHINSKIJ(RegionNames.VITEBSK), USHACHSKIJ(RegionNames.VITEBSK),
    CHASHNIKSKIJ(RegionNames.VITEBSK), SHARKOVSHHINSKIJ(RegionNames.VITEBSK), SHUMILINSKIJ(RegionNames.VITEBSK),
    MAXVITEBSK(RegionNames.VITEBSK);


    private String area;

    AreaNames(RegionNames regionNames) {
        area=  regionNames.toString();
    }

    public String getArea() {
        return area;
    }
}
