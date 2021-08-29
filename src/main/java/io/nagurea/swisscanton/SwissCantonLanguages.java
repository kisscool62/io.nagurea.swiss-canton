package io.nagurea.swisscanton;

/**
 * Swiss official languages according to iso 639-1|2|3 and their name in the given language
 */
public enum SwissCantonLanguages {
    ROMANSH("rm", "roh", "roh", "Rumantsch grischun"),
    FRENCH("fr", "fre/fra", "fra", "Français"),
    GERMAN("de", "ger/deu", "deu", "Deutsch"),
    ITALIAN("it", "ita", "ita", "Italiano");

    private final String iso_639_1;
    private final String iso_639_2;
    private final String iso_639_3;
    private final String nameInLanguage;

    private SwissCantonLanguages(String iso_639_1, String iso_639_2, String iso_639_3, String nameInLanguage) {
        this.iso_639_1 = iso_639_1;
        this.iso_639_2 = iso_639_2;
        this.iso_639_3 = iso_639_3;
        this.nameInLanguage = nameInLanguage;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }

    public String getIso_639_2() {
        return iso_639_2;
    }

    public String getIso_639_3() {
        return iso_639_3;
    }

    public String getNameInLanguage() {
        return nameInLanguage;
    }


}
