package com.qa.app;

import com.google.gson.Gson;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Service service = new Service();
		service.addAccount("Niall", "Mulready");
		service.addAccount("Sean", "McGee");
		service.addAccount("Tony", "Shannon");
		service.addAccount("Ian", "Cunningham");
		
		Gson gson = new Gson();
		String list = gson.toJson(service.getMap());
		System.out.println(list);
		
		//made a change
		/*
		System.out.println(service.getAccount(1).getAcccountNumber());
		System.out.println(service.getAccount(2).getAcccountNumber());
		System.out.println(service.getAccount(3).getAcccountNumber());
		System.out.println(service.getAccount(4).getAcccountNumber());
		*/
	}
}
