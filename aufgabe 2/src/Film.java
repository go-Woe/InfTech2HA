public class Film  implements Comparable {
    
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
    
    // Methoden
    public String toString() {
         return this.titel+"("+
				this.laenge+" min, "+ 
				this.preis + " Euro, " +
                this.erscheinungsdatum+
				")";
    }
    
    public int compareTo(Comparable other) {
        if (!(other instanceof Film)) return 0;

        Film o = (Film)other; // Nur Filme haben einen titel, Comparable-Instanzen nicht unbedingt -> casten
        if      (this.titel.compareTo(o.titel) > 0) return 1;
        else if (this.titel.compareTo(o.titel) < 0) return -1;
        else                                        return 0;
    }
}
