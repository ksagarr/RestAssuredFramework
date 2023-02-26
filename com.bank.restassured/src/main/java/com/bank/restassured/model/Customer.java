package com.bank.restassured.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private Long accountId;
	private String name;
	private String accountNumber;
	private String branchAddress;
	private String accountType;
	private String createDt;
	private Balance balance;
}
