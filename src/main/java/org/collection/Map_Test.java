package org.collection;

import java.util.*;

/*
 * This class testing for java collections map values 
 */
public class Map_Test {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("1", "kolanji");
		m.put("2", "rathna");
		m.put("3", "velmurugan");
		// Only Key Fetch
		for (Object k : m.keySet()) {

			System.out.println("K vlaues " + k);
		}

		Iterator i = m.entrySet().iterator();
		while (i.hasNext()) {
		}

		//

		// i variable we cant insert as a key in map
	}

}
