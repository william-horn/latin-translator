package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

import classes.Word.WordType;

@SuppressWarnings("unused")
public class Translator {
	// Static
	final private static Translator translator = new Translator();

	// Built during constructor
	final public HashMap<String, WordEnding> wordEndings = new HashMap<>();

	private Translator() {
		wordEndings.put("orum", new NounEnding());
	}

	private WordEnding getWordEnding(String token) {
		for (Entry<String, WordEnding> entry : this.wordEndings.entrySet()) {
			String entryEnding = entry.getKey();
			String tokenEnding = token.substring(token.length() - entryEnding.length());

			if (tokenEnding.equals(entryEnding)) {
				return entry.getValue();
			}
		}

		return null;
	}

	public String toEnglish(String latinString) {
		String[] tokens = latinString.split("\\s+");
		StringBuilder translated = new StringBuilder();

		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			WordEnding wordEnding = this.getWordEnding(token);
		}

		return translated.toString();
	}

	public static Translator getInstance() {
		return translator;
	}
}
