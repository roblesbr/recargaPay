package apis;

import io.restassured.RestAssured;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utils.settings.Settings.pathStarWars;
import static utils.settings.Settings.urlStarWars;


public class BaseApiTest {

    public static Map<String, String> map = new HashMap<String, String>();

    public static void setBaseUri() {
        RestAssured.baseURI = urlStarWars;
        RestAssured.basePath = pathStarWars;
    }

    public static void getMovie(String endpoint) {
        setBaseUri();
        String personaje = given().when().get(endpoint).then().statusCode(200).extract().path("name");
        String movie = given().when().get(endpoint).then().statusCode(200).extract().path("films[-1]");
        String name = given().when().get(movie).then().statusCode(200).extract().path("title");
        System.out.println("La ultima pelicula donde aparecio " + personaje + " fue: " + name +".");
    }
}
