package classes;

public class Declension {
	final private String[] singularCases = new String[5];
	final private String[] pluralCases = new String[5];

	public enum DeclensionGender {
		MASCULINE,
		FEMININE,
		NEUTER,
		MF,
	}

	public enum DeclensionQuantity {
		PLURAL,
		SINGULAR,
	}

	public Declension(
			String singular_nom,
			String singular_gen,
			String singular_dat,
			String singular_acc,
			String singular_abl,
			String plural_nom,
			String plural_gen,
			String plural_dat,
			String plural_acc,
			String plural_abl) {
		singularCases[0] = singular_nom;
		singularCases[1] = singular_gen;
		singularCases[2] = singular_dat;
		singularCases[3] = singular_acc;
		singularCases[4] = singular_abl;
		pluralCases[0] = plural_nom;
		pluralCases[1] = plural_gen;
		pluralCases[2] = plural_dat;
		pluralCases[3] = plural_acc;
		pluralCases[4] = plural_abl;
	}
}
