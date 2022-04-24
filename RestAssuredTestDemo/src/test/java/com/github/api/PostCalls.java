package com.github.api;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostCalls {

	

	@Test(dataProvider="DataForPost",dataProviderClass=DataForTests.class)
	public void test_createNewRepo(String name , Boolean body){
		JSONObject repo =  new JSONObject();
		repo.put("name", name);
		repo.put("private", body);
		System.out.println(repo);

		given().auth().oauth2("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").
		body(repo.toJSONString()).
		when().
		post("https://api.github.com/user/repos").
		then().
		statusCode(201);
	}

}
