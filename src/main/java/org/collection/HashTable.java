package org.collection;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {

		// Creating Hashtable object
		Hashtable<Integer, String> ht = new Hashtable<>();

		// Adding entry to Hashtable
		// Custom input entries
		ht.put(65, "A");
		ht.put(65, "C");
		ht.put(67, "C");
		ht.put(68, "D");

		// Print and display the HashTable elements
		System.out.println(ht);
	}
}
