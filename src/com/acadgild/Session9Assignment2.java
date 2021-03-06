package com.acadgild;

import java.util.*;

/**
 * 
 * Program to copy all the elements from set2 to set1 so that the set1 becomes the union
 * of set1 and set2.
 */
public class Session9Assignment2 {

	public static void main(String[] args) {

		// create two lists
		List<String> set1 = new ArrayList<String>(5);
		List<String> set2 = new ArrayList<String>(10);

		// populate two lists
		set1.add("Delhi");
		set1.add("is");

		set2.add("Capital");
		set2.add("of");
		set2.add("India");

		// copy the contents of set2 to set1
		set1.addAll(set2);

		System.out.println("Value of set1: " + set1);
		System.out.println("Value of set2: " + set2);

	}

}
