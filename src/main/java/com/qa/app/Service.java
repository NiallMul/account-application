package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Account> accountsMap;
	
	public Service() {
	}

	public Integer addKey() {
		Integer key;
		key = accountsMap.size()+1;
		return key;
	}
	
	public void addAccount(String fName, String lName) {
		Account accnt;
		if(isMapEmptyOrNull()) {
			accnt = new Account(fName,lName, 1);
			accountsMap = new HashMap<Integer, Account>();
			accountsMap.put(1, accnt);
		}else {
			accnt = new Account(fName,lName, addKey());
			accountsMap.put(addKey(),accnt);
		}
	}
	
	public Account getAccount(Integer key) {
		Account accnt = new Account();
		if(isMapEmptyOrNull()) {
		}else {
			accnt = accountsMap.get(key);
		}
		return accnt;
	}
	
	public void removeAccount(Integer key) {
		if(isMapEmptyOrNull()) {
			
		}else {
			accountsMap.remove(key);
		}
	}
	
	public boolean isMapEmptyOrNull(){
		if(accountsMap == null||accountsMap.size()<=0 )
			return true;
		else
			return false;
	}
}
