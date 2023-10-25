package ru.netology.rest;

import org.junit.jupiter.api. Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


class PostmanEchoTest {


    @Test
    void shouldReturnSendData () {
        given() RequestSpecification
                .baseUri ("https://postman-echo.com")
                .body ("Hi")
                .when ()
                .post ( path: "/post") Response
                .then () ValidatableResponse
                . statusCode ( expectedStatusCode: 200)
.body( path: "data", equalTo( operand : "Hi"));
        @Test
        public void testPostRequest() {
            given()
                    .baseUri("https://postman-echo.com%22/)
                            .body("some data")
                            .when()
                            .post("/post")
                            .then()
                            .statusCode(200)
                            .body("data", equalTo("some data"));
        }
    }