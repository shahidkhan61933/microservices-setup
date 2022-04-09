package com.alzohar.accounts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
	
	private int id;
	private String username;
	private String password;
	private boolean enabled;
	private String email;
	private String phone;
}
