package org.collection;

import java.util.ArrayList;
import java.util.List;

public class UsingFinalList {
public static void main(String[] args) {
	final List list=new ArrayList();
	list.add("1");
	list.add("2");
	
	list.add("3");
	System.out.println("Size of array"+list.size());
}
}
