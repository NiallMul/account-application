package com.qa.app;

import org.json.simple.JSONObject;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Service service = new Service();
		service.addAccount("Niall", "Mulready");
		service.addAccount("Sean", "McGee");
		service.addAccount("Tony", "Shannon");
		service.addAccount("Ian", "Cunningham");
		
		JSONObject jObject = new JSONObject();
		jObject.put(1, service.getMap());
		System.out.println(jObject.get(1).toString());
		/*
		System.out.println(service.getAccount(1).getAcccountNumber());
		System.out.println(service.getAccount(2).getAcccountNumber());
		System.out.println(service.getAccount(3).getAcccountNumber());
		System.out.println(service.getAccount(4).getAcccountNumber());
		*/
	}
}
