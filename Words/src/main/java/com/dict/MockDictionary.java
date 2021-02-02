package com.dict;

import java.util.HashSet;
import java.util.Set;

public class MockDictionary implements Dictionary {

	static Set<String> dicWords = new HashSet<String>() {
		{
			add("WORD");
			add("KING");
			add("ROW");
			add("RING");
			add("KNOW");
			add("HELLO");
			add("GO");
			add("WING");

		}
	};

	public boolean IsEnglishWord(String word) {
		if (dicWords.contains(word))
			return true;
		return false;

	}

}
