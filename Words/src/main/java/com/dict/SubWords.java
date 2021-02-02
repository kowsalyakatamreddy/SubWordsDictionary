package com.dict;

import java.util.HashSet;
import java.util.Set;

//Assumptions:
//1. The class currently support a maximum of 8 letter words as input As 7 Letter word generates 960,799 possible combinations of words and 8 Letter word generates 19,173,960 possible combinations of words
//2. Sub Words currently uses a Mock com.dict.Dictionary with few valid words, remaining words are considered invalid words.

public class SubWords {

	StringBuilder localString = new StringBuilder();
	public String word;
	long count = 0;
	Dictionary mockDic = new MockDictionary();
	// Dictionary onlineDic = new OnlineDictionary();
	Set<String> result = new HashSet<String>();

	public Set<String> getSubWords(String str) throws Exception {

		if (str.length() > 8) {
			throw new Exception("String is lenghty");
		}

		word = str.toUpperCase();
		generateSub(localString);
		System.out.println("Total Possible Sub words: " + count);
		return result;

	}

	public void generateSub(StringBuilder localString) {

		if (localString.length() >= word.length())
			return;

		for (int i = 0; i < word.length(); i++) {

			StringBuilder newlocalString = new StringBuilder(localString);
			newlocalString.append(word.charAt(i));
			count++;

			// Checking the word list from OnlineDictionary
			// if(onlineDic.IsEnglishWord(newlocalString.toString())) {
			// result.add(newlocalString.toString());
			// }

			// Currently using MockDictionary for testing.
			// We can use OnlineDictionary implementation for Production code
			if (mockDic.IsEnglishWord(newlocalString.toString())) {
				result.add(newlocalString.toString());
			}

			generateSub(newlocalString);
		}

	}

}
