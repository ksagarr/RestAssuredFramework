package RequestSpec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {

	public RequestSpecification getRequest() {
		return new RequestSpecBuilder().setBaseUri("http://localhost:8080/ac")
				.setBasePath("/all").setContentType("application/json").build();
	}
	public RequestSpecification getRequestTypi() {
		return new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com")
				.setBasePath("/users").setContentType("application/json").build();
	}
	public RequestSpecification getResponseAsList() {
		return new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com")
				.setBasePath("/comments").setContentType("application/json").build();
	}
	public RequestSpecification getProducts() {
		return new RequestSpecBuilder().setBaseUri("https://run.mocky.io/v3/").
				setBasePath("1cd6a78e-0b68-4648-96c1-139cdfa5950d").setContentType("application/json")
				.build();
	}
}
