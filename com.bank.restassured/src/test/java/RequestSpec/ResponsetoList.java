package RequestSpec;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponsetoList extends RequestSpecificationBuilder {

	Response response;
	RequestSpecification http;
	@Test
	public void getResp() {
		http=RestAssured.given(getResponseAsList());
		response =http.request(Method.GET);
		List<Map<String, Object>> data=response.as(new TypeRef<List<Map<String, Object>>>(){});
		System.out.println(data.get(0).get("name"));
	}
}
