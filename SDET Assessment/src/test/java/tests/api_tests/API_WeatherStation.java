package tests.api_tests;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import kinectic.global.BaseTest.BaseAPITest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static io.restassured.RestAssured.given;

public class API_WeatherStation extends BaseAPITest {

    SoftAssert softAssert = new SoftAssert();

    String externalID = "LJ";
    String stationName = "Buh-Rein Estate Test Station1";
    String latitude = "-33.82052";
    String longitude = "18.71317";
    String altitude = "1200";
    String id;

    @Test(priority = 1)
    public void RegisterWeatherStation(){

        RequestSpecification request = BaseAPITest.getRequest();

        String createStation = "{\"external_id\":\""+externalID+"\",\"name\":\""+stationName+"\",\"latitude\":"+latitude+",\"longitude\":"+longitude+",\"altitude\":"+altitude+"}";

        Response station = given(request).
                body(createStation).
                post("http://api.openweathermap.org/data/3.0/stations");

        Assert.assertEquals(station.getStatusCode(),201);
        JsonPath json = station.jsonPath();

        System.out.println("Register Station: " + station.prettyPrint());

        id = json.getString("ID");
        Assert.assertNotNull(id,"ID");
        System.out.println("ID: " + id);

        String user_id = json.getString("user_id");
        System.out.println("User ID: " + user_id);

        externalID = json.getString("external_id");
        System.out.println("External ID: " + externalID);

        String name = json.getString("name");
        System.out.println("Station Name: " + name);
        softAssert.assertEquals(name,stationName,"stationName");

        String latitudeActual = json.getString("latitude");
        softAssert.assertEquals(latitudeActual,latitude,"latitude");
        System.out.println("Latitude: " + latitudeActual);

        String longitudeActual = json.getString("longitude");
        softAssert.assertEquals(longitudeActual,longitude,"longitude");
        System.out.println("Longitude: " + longitudeActual);

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void UpdateStationInfo(){
        String stationNameUpdated = "Buh-Rein Estate Updated Station1";

        RequestSpecification request = BaseAPITest.getRequest();

        String createStation = "{\"external_id\":\""+externalID+"\",\"name\":\""+stationNameUpdated+"\",\"latitude\":"+latitude+",\"longitude\":"+longitude+",\"altitude\":"+altitude+"}";

        Response station = given(request).
                body(createStation).
                put("http://api.openweathermap.org/data/3.0/stations/"+id);

        Assert.assertEquals(station.getStatusCode(),200);
        JsonPath json = station.jsonPath();

        System.out.println("Update Station: " + station.prettyPrint());

        String stationNameActual = json.getString("name");
        softAssert.assertEquals(stationNameActual, stationNameUpdated,"Weather Station Name Updated");
        System.out.println("Updated Station Name: " + stationNameActual);

        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void DeleteWeatherStation(){
        RequestSpecification request = BaseAPITest.getRequest();

        String createStation = "{\"external_id\":\""+externalID+"\",\"name\":\""+stationName+"\",\"latitude\":"+latitude+",\"longitude\":"+longitude+",\"altitude\":"+altitude+"}";

        Response station = given(request).
                body(createStation).
                delete("http://api.openweathermap.org/data/3.0/stations/"+id);

        Assert.assertEquals(station.getStatusCode(),204);
        System.out.println("StatusCode: " + station.getStatusCode());

        System.out.println("Delete Station: " + station.prettyPrint());
    }
}
