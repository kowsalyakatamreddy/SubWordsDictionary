package com.dict;

import java.util.HashSet;
import java.util.Set;

public class SubWordsMain {

	public static void main(String[] args) {

		SubWords sb = new SubWords();

		try {
			Set<String> finalList = new HashSet<String>();

			// Test case: Valid Input
			finalList = sb.getSubWords("WORKING");

			// Test case: Valid Input
			// finalList = sb.getSubWords("GOLD");

			// Test case: Valid Input - Lower case valid String
			// finalList = sb.getSubWords("working");

			// Test case: Invalid Input - large size string
			// finalList =sb.getSubWords("working desk");

			System.out.println("Total valid words: " + finalList.size());
			for (String wordlist : finalList) {
				System.out.println("wordlist: " + " " + wordlist);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}