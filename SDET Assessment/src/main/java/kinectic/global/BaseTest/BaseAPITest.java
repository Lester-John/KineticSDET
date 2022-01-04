package kinectic.global.BaseTest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.JsonConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class BaseAPITest {

    public static RequestSpecification getRequest() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addQueryParam("appID", "68ac454882d944ab798294a6560cb176")
                .setConfig(RestAssured.config.jsonConfig(JsonConfig.jsonConfig()))
                .build();
    }
}
