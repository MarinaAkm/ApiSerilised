import Entities.Request.UserRequest;
import Entities.Response.User;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CreateUsers {

    String BASE_URI = "https://reqres.in";
    String USER_URI = "/api/users";

    @Test()
    public void TestPost(){
        UserRequest userRequest = new UserRequest()
                .setName("Marina")
                .setJob("Laboratory");

        User userResponse = given()
                .baseUri(BASE_URI)
                .log().everything()
                .contentType(ContentType.JSON)
                .body(userRequest)
                .when()
                .post(USER_URI)
                .then()
                .extract()
                .body().as(User.class);

        assertEquals(userResponse.getName(), userRequest.getName());
        assertEquals(userResponse.getJob(), userRequest.getJob());

    }
}
