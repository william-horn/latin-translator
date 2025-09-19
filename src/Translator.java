import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Translator {
	final private static Translator translator = new Translator();
	final private String[] dataFiles = {
			"dictionary/nouns.txt",
			"dictionary/verbs.txt",
	};

	private Translator() {
		try {
			for (String path : dataFiles) {
				File file = new File(path);
				Scanner fileScanner = new Scanner(file);

				while (fileScanner.hasNextLine()) {
					String nextLine = fileScanner.nextLine();
					if (nextLine.startsWith("#")) {
						continue;
					}
				}

				fileScanner.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public String toEnglish(String latinString) {
		String[] tokens = latinString.split("\\s+");
		return "";
	}

	public static Translator getInstance() {
		return translator;
	}
}
