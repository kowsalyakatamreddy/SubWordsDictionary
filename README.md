## Project Overview
SubWordsDictionary is a Java Project to find all of the possible English words in a given String.  
For example, if you are given the word WORKING, it finds subwords like WORK and KING and also ROW, RING and KNOW etc.  
Dictionary interface has isEnglishWord(String word) which has MockedDictionary and OnlineDictionary implementations.
MockedDictionary is meant for testing and we have test data which returns true for few valid words. 
Online Dictionary connects with http://api.dictionaryapi.dev to validate the words. Given the number of possible words are huge, OnlineDictionary implementation is commented and meant only for small words. 

## Prerequisites
1. Java 1.8.x
2. Maven 3.5.0+


## Assumptions 
1. The class currently support a maximum of 8 letter words as input As 7 Letter word generates 960,799 possible combinations of words and 8 Letter word generates 19,173,960 possible combinations of words
2. Sub Words currently uses a Mock com.dict.Dictionary with few valid words, remaining words are considered invalid words.


## Main Java Class

com.dict.SubWordsMain.java

