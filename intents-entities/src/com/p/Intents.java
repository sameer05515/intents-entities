package com.p;

import java.util.Arrays;
import java.util.List;

public enum Intents {

	Intent1("One", Entities.entity1, Entities.entity2, Entities.entity3), Intent2("Two", Entities.entity2,
			Entities.entity3), Intent3("Three", Entities.entity5);
	String title;
	List<Entities> listEntites = null;

	Intents(String i, Entities... e) {
		this.title = i;
		this.listEntites = Arrays.asList(e);
	}

	public static boolean validContent(String intent, List<String> entities) {

		boolean intentFound = false;
		boolean entitiesmatched = false;
		for (Intents i : Intents.values()) {
			if (i.title.equalsIgnoreCase(intent)) {
				////
				intentFound = true;
				boolean entityValueFound = false;
				if(entities.size()==i.listEntites.size()){
					for (String enti : entities) {
						for (Entities e : i.listEntites) {
							if (e.name().equalsIgnoreCase(enti)) {
								entityValueFound = true;
								break;
							}

						}
						if(entityValueFound){
							System.out.println("Moving to next entity search");
							continue;
						}else{
							System.out.println("Stopping search");
							break;
						}
					}
				}
				entitiesmatched=intentFound&&entityValueFound;
				

				////
				// status=true;
				break;
			}
		}

		return entitiesmatched;
	}

	enum Entities{
		entity1, entity2, entity3, entity4, entity5;
	}

}
