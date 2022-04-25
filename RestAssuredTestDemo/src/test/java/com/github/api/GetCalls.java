package com.github.api;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCalls  {
static String url="https://api.github.com";
	
@Test
	public void test_getAllPublicRepos(){
		
		RestAssured.baseURI=url;
		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
		when().
			get("/repositories").
		then().
			assertThat().
			statusCode(200);
					
	}
	
	@Test
	public void verify_RepoOfUser(){
		given().
		when().
			get("/users/KDP-Test/repos").
		then().
			assertThat().
			statusCode(200).
			and().			
			body("owner.login",hasSize(8)).
			and().
			body("owner.login", hasItems("KDP-Test")).
				log().all();
			
		
	}	
	
	@Test
	public void verify_repoOfAuthenticateduser(){
		
		given()
			.auth()
			.oauth2("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").
		when().
			get("/user/repos").
		then().
			assertThat().
			statusCode(200).
			and().			
			body("owner.login", hasItems("KDP-Test")).
				log().all();
		
	}
	
	
	
	//@Test
public void listIssuesOfAuthenticateduser(){
		
		given()
			.auth()
			.oauth2("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").
		when().
			get("/issues").
		then().
			assertThat().
			statusCode(200).
			and().			
			//body("owner.login", hasItems("KDP-Test")).
				log().all();
		
	}
	
	
}
