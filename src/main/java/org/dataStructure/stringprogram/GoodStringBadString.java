package org.dataStructure.stringprogram;

public class GoodStringBadString {
public static void main(String[] args) {
	String bad="good baad jaava schooool objeect";
	
	String goodString =bad.replaceAll("(?i)(\\p{L})\\1", "$1");
	System.out.println("Result:: "+goodString);
}
}
