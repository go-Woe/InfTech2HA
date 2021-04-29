public class Musik {
  // Attribute
  public String     titel;
  public String     interpret;
  public String     album;
  public int        laenge;             // in s
  public String     erscheinungsdatum;  // ISO-8601 (JJJJ-MM-TT)

  public Musik(String titel,String interpret,String album,int laenge,String erscheinungsdatum){
    this.album = album;
    this.erscheinungsdatum=erscheinungsdatum;
    this.interpret=interpret;
    this.laenge=laenge;
    this.titel=titel;
  }


  public String toString() {
  return "Songtitel = " + this.titel + ", Interpret = " + this.interpret + ", laenge = " + this.laenge + ", Album = " +
          this.album + ", Erscheinungsdatum = " + this.erscheinungsdatum;
  }
  public int compareTo(Musik other){
    if (this.erscheinungsdatum.compareTo(other.erscheinungsdatum) > 0) {
      return 1;
    }else if (this.erscheinungsdatum.compareTo(other.erscheinungsdatum)< 0) {
      return  -1;
    }else{
      return 0;
    }
  }
}
