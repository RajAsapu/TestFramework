package setup;

import com.google.common.base.Verify;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;


/**
 * Created by asapu on 7/7/2017.
 */
public class RestTests {
    public void test()
    {
//        Response response=
//                RestAssured.given().
//                contentType(ContentType.JSON).
//                when().
//                get("http://localhost:4233/store/3?shipmentId=12345").
//                then().
//                statusCode(200).
//                body("RFID", equalTo(rfIDRegisterd)).
//                body("ShipmentId", equalTo(shipmentID));
//        ResponseBody responseBody=response.getBody();
//        Verify.verify(response.getStatusCode()==200);
//        Assert.assertTrue(responseBody);
//        responseBody.prettyPeek();
//        responseBody.toString().contains("status");

    }
}
