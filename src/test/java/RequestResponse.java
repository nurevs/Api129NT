import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {

    public static void main(String[] args) {

        /*
        1)Postman manuel test icin kullanilir.
        2)Otomasyon icin Rest-Assured library kullaniyoruz.
        3)Otomasyonu yazabilmek icin su aidmlarin izlenmesi gerekir:
            i)Gereksinimleri anlama
           ii)Test case yazma:
               -Test yazmak icin Gherkin language kullanilir.
                   1)Given: On kosullar--> url,body ..
                   2)When : Yapilacak islemler --> Get,Put,Post ..requests..
                   3)Then: Ciktilar,donutler.. assertions, close..
                   4)And: Ard arda yapilan ayni coklu islemleri baglamak icin kullanilir
          iii)Otomasyon kodlarini yazma:
                a)Set the Utl==> endpointi kur
                b)Set the expected data--> beklenen veriyi kur
                c)Send the request and get the response--> requesti gonder ve response'i al
                d)Do assertion --> Dgrulama yap

         */

        //Get response nasil yapilir:
        String url="https://petstore.swagger.io/v2/pet/23423424";
        Response response=given().get(url);
        response.prettyPrint(); //sout yerine

        //Status code;a nasil ulasilip yazdirilir.
        System.out.println("Ststis Code"+response.statusCode());

        //Content Type nasil yazdirilir.
        System.out.println("Content Type "+response.contentType());

        //Status Line nasil yazdirilir
        System.out.println("Status Code "+response.statusLine());

        //header nasil yazdirilir
        System.out.println("Server Adi "+response.header("Server"));
        System.out.println("Connection Adi "+response.header("Connection"));

        //Headeres nasil yazdirilir(Hepsini yazdirir)
        System.out.println("*****************");
        System.out.println(response.headers());

        //Time nasil yazdirilir
        System.out.println("\nTime: "+response.getTime());



    }
}
