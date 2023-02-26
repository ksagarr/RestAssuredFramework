package com.bank.restassured.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
   
	Long balanceId;
	BigDecimal balance;
}
