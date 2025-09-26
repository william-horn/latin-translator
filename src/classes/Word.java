package classes;

public class Word {
	public String stem;
	public WordType wordType;

	public enum WordType {
		NOUN,
		VERB,
	}

	public Word(String stem, WordType wordType) {
		this.stem = stem;
		this.wordType = wordType;
	}

	public String getStem() {
		return stem;
	}

	public WordType getWordType() {
		return wordType;
	}
}
