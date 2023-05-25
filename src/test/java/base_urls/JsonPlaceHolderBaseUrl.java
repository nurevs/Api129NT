package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.*;
import org.junit.Before;


public class JsonPlaceHolderBaseUrl {
    //setUp() methodu ile request işleminde tekrarlı şekilde yapılacak işlemler
    // burada bir kez yapılacak. @Test öncesi çalışması için @Before anatasyonu ekliyoruz.
    protected RequestSpecification spec;

    @Before
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/").setAccept(ContentType.JSON).build();

    }
}
