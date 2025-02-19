package com.example.api;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {

    @Test
    public void simpleAPITest() {
        ApiClient client = new ApiClient();
        Response response = client.get("https://api.github.com");

        // Continue interview task here...
        // For example:
        // System.out.println("Status code: " + response.getStatusCode());
    }
}
