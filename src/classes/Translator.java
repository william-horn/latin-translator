package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

import classes.Word.WordUsage;

@SuppressWarnings("unused")
public class Translator {
	// Static
	final private static Translator translator = new Translator();

	// Built during constructor
	final private HashMap<String, WordUsage> wordEndings;

	private Translator() {
		Declension[] declensions = {
				new Declension("a", "ae", "ae", "am", "a", "ae", "arum", "is", "as", "is"),
				new Declension("us", "i", "o", "um", "o", "i", "orum", "is", "os", "is"),
				new Declension("um", "i", "o", "um", "o", "a", "orum", "is", "a", "is"),
		};

		HashMap<String, WordUsage> wordEndings = new HashMap<>();
		this.wordEndings = wordEndings;
	}

	public String toEnglish(String latinString) {
		String[] tokens = latinString.split("\\s+");
		return "";
	}

	public static Translator getInstance() {
		return translator;
	}
}
