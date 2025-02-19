package com.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiClient {

    private RequestSpecification request;

    public ApiClient() {
        // Initialize the RestAssured request with default settings if needed
        request = RestAssured.given();
        // For example, you can set default headers or authentication here
    }

    public Response get(String url) {
        return request.get(url);
    }

    public Response post(String url, Object body) {
        return request.body(body).post(url);
    }

    public Response put(String url, Object body) {
        return request.body(body).put(url);
    }

    // Optionally, add methods for DELETE, PATCH, etc.
}
