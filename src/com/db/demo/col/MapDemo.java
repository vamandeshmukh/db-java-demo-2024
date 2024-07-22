package com.db.demo.col;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> stateCodes = new HashMap<>();
//		HashMap<Integer, String> stateCodes2 = new HashMap<>(); 

		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("TG", "Telangana");
		stateCodes.put("KA", "Karnataka");
		stateCodes.put("GJ", "Gujarat");

//		System.out.println(stateCodes);
		System.out.println(stateCodes.get("TG"));

	}

}
