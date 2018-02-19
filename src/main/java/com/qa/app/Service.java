package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Account> accountsMap;
	
	public Integer addKey() {
		Integer key;
		key = accountsMap.size()+1;
		return key;
	}
	
	public void addAccount(Account accnt) {
		if(accountsMap.size()<=0) {
			accountsMap = new HashMap<Integer, Account>();
			accountsMap.put(1, accnt);
		}else {
			accountsMap.put(addKey(),accnt);
		}
	}
	
	public Account getAccount(Integer key) {
		Account accnt = new Account();
		if(accountsMap.size()<=0) {
		}else {
			accnt = accountsMap.get(key);
		}
		return accnt;
	}
	
	public void removeAccount(Integer key) {
		if(accountsMap.size()<=0) {
			
		}else {
			accountsMap.remove(key);
		}
	}
}
