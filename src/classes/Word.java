package classes;

public class Word {
	public String stem;

	public enum WordUsage {
		NOUN,
		VERB,
	}

	public Word(String stem) {
		this.stem = stem;
	}
}
