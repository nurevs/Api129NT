package get_requests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Get01 {

     /*
Given
    https://restful-booker.herokuapp.com/booking/55
When
    User sends a GET Request to the url
Then
    HTTP Status Code should be 200
And
    Content Type should be "application/json"
And
    Status Line should be "HTTP/1.1 200 OK"
*/

    @Test
    public void get01() {
//        i) Set the url --> endpoint'i kur
        String url = "https://restful-booker.herokuapp.com/booking/55";

//        ii) Set the expected data --> Bu adımı post ve put gibi data gönderilecek metholarda yapacağız.

//        iii) Send the request and get the response --> request'i gönder ve response'ı al
        Response response = given().get(url);
        response.prettyPrint();

//        iv) Do assertion --> Doğrulama yap
        response.then()
                .statusCode(200)//HTTP Status Code should be 200
                .contentType("application/json")//Content Type should be "application/json"
                .statusLine("HTTP/1.1 200 OK");//Status Line should be "HTTP/1.1 200 OK"
    }

    @Test
    public void get02(){
        //Set the url
        String url = "https://restful-booker.herokuapp.com/booking/0";

        //Set the expected data --> İleride

        //Send the request and het the response
        Response response = given().get(url);
        response.prettyPrint();

        //Do assertion
        response.then()
                .statusCode(404)// HTTP Status code should be 404
                .statusLine("HTTP/1.1 404 Not Found");//Status Line should be "HTTP/1.1 404 Not Found"

        //Response body contains "Not Found"
        assertTrue(response.asString().contains("Not Found"));

        //Response body does not contain "TechProEd"
        assertFalse(response.asString().contains("TechProEd"));


    }
}
