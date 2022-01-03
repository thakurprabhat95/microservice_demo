package com.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping("/getallaccount")
	public String getAllAcount()
	{
		return "this is account service";
	}
	
	@GetMapping("/getaccountbyname")
	public String getAllAcountById()
	{
		return "I am from account-service";
	}
 
	@GetMapping("/getAccountById/{id}")
	public String getAccountById(@PathVariable("id") Integer id)
	{
		return "Account-service id is..."+id;
	}
	//account-service-->producer-->give payment
	//shipping-service-->consumer-->take payment from account-service
	//feign clinet, restTemplate
}
