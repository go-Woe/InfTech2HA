public class Film {
    
    // Attribute
    public String titel;
    public double preis; // in EUR
    public int    laenge; // in min
    public String beschreibung;
    public String erscheinungsdatum; // ISO-8601 (JJJJ-MM-TT)
    
    // Konstruktor
    public Film(String titel, double preis, int laenge, String beschreibung, String erscheinungsdatum) {
        this.titel = titel;
        this.preis = preis;
        this.laenge = laenge;
        this.beschreibung = beschreibung;
        this.erscheinungsdatum = erscheinungsdatum;
    }
    
    // Generiert String-Repraesentation
    public String toString() {
        return  "Film={" + "\r\n" +
                "\t" + "titel=" + this.titel + "," + "\r\n" +
                "\t" + "preis=" + this.preis + "," + "\r\n" +
                "\t" + "laenge=" + this.laenge + "," + "\r\n" +
                "\t" + "beschreibung=" + this.beschreibung + "," + "\r\n" +
                "\t" + "erscheinungsdatum=" + this.erscheinungsdatum + "\r\n" +
                "}";
    }

    // Vergleicht das Filmobjekt mit einem uebergebenem Filmobjekt other
    // Gibt true zurueck, falls alle Attribute uebereinstimmen, false sonst
    public boolean equals(Film other) {
        final double EPS = 0.001; // Epsilon fuer double-Attribut-Vergleich
        return this.titel.compareTo(other.titel) == 0
                && Math.abs(this.preis - other.preis) < EPS
                && this.laenge == other.laenge
                && this.beschreibung.compareTo(other.beschreibung) == 0
                && this.erscheinungsdatum.compareTo(other.erscheinungsdatum) == 0;
    }
    
}
