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
	private Translator() {
	}

	public String toEnglish(String latinString) {
		String[] tokens = latinString.split("\\s+");

		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			Declension.decline(token);
		}

		return "";
	}

	public static Translator getInstance() {
		return translator;
	}
}
