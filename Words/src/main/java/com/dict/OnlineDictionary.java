package com.dict;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OnlineDictionary implements Dictionary {

	public boolean IsEnglishWord(String word) {

		String DICT_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

		URL url;
		try {
			url = new URL(DICT_URL + word);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int status = con.getResponseCode();
			if (status != 200) 
				return false; 
			else
				return true; 
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
