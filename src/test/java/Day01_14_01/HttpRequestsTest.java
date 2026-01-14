package Day01_14_01;

/*
 * given()
 * when()
 * then()
 * 
 */
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HttpRequestsTest {

	@Test
	void getusers() {
		given()

				.when().get("https://jsonplaceholder.typicode.com/posts/1")
				
				.then()
				.statusCode(200)
				.log().all();
	}

}
