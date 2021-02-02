package apis;

import org.testng.annotations.Test;

import static utils.settings.Settings.*;

public class StarWarsApi extends BaseApiTest{

    @Test
    public static void ultimaPelicula(){
        getMovie(bobbaFett);
        getMovie(darthVader);
        getMovie(obiWan);
    }


}
