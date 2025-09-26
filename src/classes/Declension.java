package classes;

import java.util.HashMap;

import classes.Word.WordType;

public class Declension {
	final private static HashMap<String, DeclensionEnding> endings = new HashMap<>();

	public class DeclensionEnding {

	}

	public static void add(String ending, DeclensionEnding declensionEnding) {
		endings.put(ending, declensionEnding);
	}

	public static void decline(String token) {

	}
}
