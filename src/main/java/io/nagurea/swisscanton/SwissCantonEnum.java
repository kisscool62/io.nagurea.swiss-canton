package io.nagurea.swisscanton;

import java.time.LocalDate;

import static io.nagurea.swisscanton.SwissCantonLanguages.FRENCH;
import static io.nagurea.swisscanton.SwissCantonLanguages.GERMAN;
import static io.nagurea.swisscanton.SwissCantonLanguages.ITALIAN;
import static io.nagurea.swisscanton.SwissCantonLanguages.ROMANSH;

/**
 * 26 swiss cantons named by their code. You can use this code added to CH- if you want to use the ISO 3166-2 codes of switzerland.
 * Data from :
 * - <a href="https://en.wikipedia.org/wiki/Cantons_of_Switzerland">https://en.wikipedia.org/wiki/Cantons_of_Switzerland</a> and
 * - <a href="https://fr.wikipedia.org/wiki/Canton_(Suisse)">https://fr.wikipedia.org/wiki/Canton_(Suisse)</a>
 */
public enum SwissCantonEnum {

    /**
     * Aargau
     */
    AG("Aargau", "Argovia", "Aargau", "Argovie", "Argovia", "Argovia", LocalDate.of(1803, 2, 19), "Aarau", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Appenzell Innerrhoden
     */
    AI("Appenzell Innerrhoden", "Appenzell Inner-Rhodes", "Appenzell Innerrhoden", "Appenzell Rhodes-Intérieures", "Appenzello Interno", "Appenzell dadens", LocalDate.of(1513, 12, 17), "Appenzell", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Appenzell Ausserrhoden
     */
    AR("Appenzell Ausserrhoden", "Appenzell Outer-Rhodes", "Appenzell Ausserrhoden", "Appenzell Rhodes-Extérieures", "Appenzello Esterno", "Appenzell dador", LocalDate.of(1513, 12, 17), "Herisau", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Basel-Stadt
     */
    BS("Basel-Stadt", "Basle-City", "Basel-Stadt ", "Bâle-Ville", "Basilea Città", "Basilea-Citad", LocalDate.of(1501, 7, 13), "Bâle", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Basel-Landschaft
     */
    BL("Basel-Landschaft", "Basle-Country", "Basel-Landschaft ", "Bâle-Campagne", "Basilea Campagna", "Basilea-Champagna;", LocalDate.of(1501, 7, 13), "Liestal", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Bern
     */
    BE("Bern", "Berne", "Bern ", "Berne", "Berna", "Berna", LocalDate.of(1353, 3, 6), "Berne", new SwissCantonLanguages[]{GERMAN, FRENCH}),

    /**
     * Fribourg
     */
    FR("Fribourg", "Friburg", "Freiburg ", "Fribourg", "Friburgo", "Friburg", LocalDate.of(1481, 12, 22), "Fribourg", new SwissCantonLanguages[]{FRENCH, GERMAN}),

    /**
     * Genève
     */
    GE("Genève", "Geneva", "Genf ", "Genève", "Ginevra", "Genevra", LocalDate.of(1815, 5, 19), "Geneve", new SwissCantonLanguages[]{FRENCH}),

    /**
     * Glarus
     */
    GL("Glarus", "Glaris", "Glarus ", "Glaris", "Glarona", "Glaruna", LocalDate.of(1352, 6, 4), "Glaris", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Graubünden
     */
    GR("Graubünden", "Grisons", "Graubünden ", "Grisons", "Grigioni", "Grischun", LocalDate.of(1803, 2, 19), "Coire", new SwissCantonLanguages[]{GERMAN, ROMANSH, FRENCH}),

    /**
     * Jura
     */
    JU("Jura", "Jura ", "Jura", "Jura", "Giura", "Giura", LocalDate.of(1979, 1, 1), "Delémont", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Lucerne
     */
    LU("Lucerne", "Lucerne", "Luzern ", "Lucerne", "Lucerna", "Lucerna", LocalDate.of(1332, 11, 7), "Lucerne", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Neuchâtel
     */
    NE("Neuchâtel","Neuchâtel", "Neuenburg ", "Neuchâtel", "Neuchâtel", "Neuchâtel", LocalDate.of(1815, 5, 19), "Neuchâtel", new SwissCantonLanguages[]{FRENCH}),

    /**
     * Nidwalden
     */
    NW("Nidwalden", "Nidwald", "Nidwalden ", "Nidwald", "Nidvaldo", "Sutsilvania", LocalDate.of(1291, 8, 1), "Stans", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Obwalden
     */
    OW("Obwalden", "Obwald", "Obwalden ", "Obwald", "Obvaldo", "Sursilvania", LocalDate.of(1291, 8, 1), "Sarnen", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Schaffhausen
     */
    SH("Schaffhausen", "Schaffhouse", "Schaffhausen ", "Schaffhouse", "Sciaffusa", "Schaffusa", LocalDate.of(1501, 8, 19), "Schaffhouse", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Schwyz
     */
    SZ("Schwyz", "Schwyz","Schwyz ", "Schwytz", "Svitto", "Sviz", LocalDate.of(1291, 8, 1), "Schwytz", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Solothurn
     */
    SO("Solothurn", "Soleure", "Solothurn ", "Soleure", "Soletta", "Soloturn", LocalDate.of(1481, 12, 22), "Soleure", new SwissCantonLanguages[]{GERMAN}),

    /**
     * St. Gallen
     */
    SG("St. Gallen", "St Gall", "St. Gallen ", "Saint-Gall", "San Gallo", "Son Gagl", LocalDate.of(1803, 2, 19), "Saint-Gall", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Thurgau
     */
    TG("Thurgau", "Thurgovia", "Thurgau ", "Thurgovie", "Turgovia", "Turgovia", LocalDate.of(1803, 2, 19), "Frauenfeld", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Ticino
     */
    TI("Ticino", "Tessin", "Tessin ", "Tessin", "Ticino", "Tessin", LocalDate.of(1803, 2, 19), "Bellinzone", new SwissCantonLanguages[]{ITALIAN}),

    /**
     * Uri
     */
    UR("Uri", "Uri", "Uri ", "Uri", "Uri", "Uri", LocalDate.of(1291, 8, 1), "Altdorf", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Valais
     */
    VS("Valais", "Wallis", "Wallis ", "Valais", "Vallese", "Vallais", LocalDate.of(1815, 8, 4), "Sion", new SwissCantonLanguages[]{FRENCH, GERMAN}),

    /**
     * Vaud
     */
    VD("Vaud", "Vaud","Waadt ", "Vaud", "Vaud", "Vad", LocalDate.of(1803, 2, 19), "Lausanne", new SwissCantonLanguages[]{FRENCH}),

    /**
     * Zug
     */
    ZG("Zug", "Zoug", "Zug ", "Zoug", "Zugo", "Zug", LocalDate.of(1352, 6, 27), "Zoug", new SwissCantonLanguages[]{GERMAN}),

    /**
     * Zürich
     */
    ZH("Zürich", "Zurich", "Zürich ", "Zurich", "Zurigo", "Turitg", LocalDate.of(1351, 5, 1), "Zurich", new SwissCantonLanguages[]{GERMAN});

    private final String name;
    private final String nameInEnglish;
    private final String nameInGerman;
    private final String nameInFrench;
    private final String nameInItalian;
    private final String nameInRomansh;
    private final LocalDate includedSince;
    private final String capital;
    private final SwissCantonLanguages[] officialLanguages;
    
    private SwissCantonEnum(String name, String nameInEnglish, String nameInGerman, String nameInFrench, String nameInItalian, String nameInRomansh, LocalDate includedSince, String capital, SwissCantonLanguages[] officialLanguages) {
        this.name = name;
        this.nameInEnglish = nameInEnglish;
        this.nameInGerman = nameInGerman;
        this.nameInFrench = nameInFrench;
        this.nameInItalian = nameInItalian;
        this.nameInRomansh = nameInRomansh;
        this.includedSince = includedSince;
        this.capital = capital;
        this.officialLanguages = officialLanguages;
    }

    /**
     * Name is the name of the canton in the main language of the canton
     */
    public String getName() {
        return name;
    }

    /**
     * NameInEnglish is the name of the canton in english
     */
    public String getNameInEnglish() {
        return nameInEnglish;
    }

    /**
     * NameInEnglish is the name of the canton in german
     */
    public String getNameInGerman() {
        return nameInGerman;
    }

    /**
     * NameInEnglish is the name of the canton in french
     */
    public String getNameInFrench() {
        return nameInFrench;
    }

    /**
     * NameInEnglish is the name of the canton in italian
     */
    public String getNameInItalian() {
        return nameInItalian;
    }

    /**
     * NameInEnglish is the name of the canton in romansh
     */
    public String getNameInRomansh() {
        return nameInRomansh;
    }

    /**
     * Date of inclusion in the swiss confederation. When exact day of month was unknown, then day has been set to 01.
     */
    public LocalDate getIncludedSince() {
        return includedSince;
    }

    /**
     * Capital of the canton
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Official languages spoken in the canton
     */
    public SwissCantonLanguages[] getOfficialLanguages() {
        return officialLanguages;
    }


}
