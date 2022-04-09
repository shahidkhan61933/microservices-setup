package com.alzohar.accounts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alzohar.accounts.entity.Account;

@RestController
public class AccountController {
	
	List<Account> accounts = new ArrayList<Account>();
	
	@GetMapping("/accounts")
	public List<Account> getAll() {
		if(accounts.isEmpty()) {
			addDefaults();
		}
		return accounts;
	}
	
	@GetMapping("/accounts/{id}")
	public Account getOne(@PathVariable("id") int id) {
		for(Account acc: accounts) {
			if(acc.getId()==id) {
				return acc;
			}
		}
		return null;
	}

	private void addDefaults() {
		accounts.add(new Account(1001, "John", "john@123", false, "john@gmail.com", "9898989898"));
		accounts.add(new Account(1002, "Mike", "mike@123", false, "mike@gmail.com", "8898989898"));
		accounts.add(new Account(1003, "Will", "will@123", false, "will@gmail.com", "7898989898"));
		accounts.add(new Account(1004, "KIm", "kim@123", false, "kim@gmail.com", "6898989898"));
	}
}
