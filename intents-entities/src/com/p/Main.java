package com.p;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		String intent = "One";
		List<String> entrities = Arrays.asList("entity1", "entity2", "entity3");

		boolean b = Intents.validContent(intent, entrities);

		System.out.println(b);
		
		System.out.println(Intents.validContent("One", Arrays.asList("entity1", "entity2", "entity3","entity4")));
		
		

	}

	

}
