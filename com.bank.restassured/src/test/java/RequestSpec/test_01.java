package RequestSpec;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.restassured.model.User;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test_01 extends RequestSpecificationBuilder{

	Response response;
	RequestSpecification http;
	@Test
	public void getResp() {
		http=RestAssured.given(getRequestTypi());
		response =http.request(Method.GET);
		User[] res=response.as(User[].class);
		System.out.println(res[0].getName());
		System.out.println(res[0].getAddress().getZipcode());
		System.out.println(res[0].getAddress().getGeo().getLng());
		System.out.println(res[0].getCompany().getName());
		System.out.println(res[0].getCompany().getCatchPhrase());
		Assert.assertEquals(res[0].getName(), "Leanne Graham");
	}

}

