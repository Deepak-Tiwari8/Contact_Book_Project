package com.ty.ContactApp;

import java.util.*;

public class Contact_Book {
	public static void main(String[] args) {
		 TreeMap tm = new TreeMap();
		 tm.put("deepak", new Contact("Deepak",7876543));
		 tm.put("madhu", new Contact("Madhu",1234565));
		 tm.put("chimgond", new Contact("Chimgond",87678876));
		 tm.put("rohit", new Contact("Rohit",45566778));
		 tm.put("raj", new Contact("Raj",897667865));
		 System.out.println(tm);
	}  
}
