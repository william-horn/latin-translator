package classes;

public class Case {
	final public WordCase _case;

	public enum WordCase {
		NOMINATIVE,
		GENITIVE,
		DATIVE,
		ACCUSITIVE,
		ABLATIVE,
		VOCATIVE,
	}

	public Case(WordCase _case) {
		this._case = _case;
	}
}
