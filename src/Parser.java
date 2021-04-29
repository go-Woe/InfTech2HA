// Die readMusik-Methode dieser Klasse liesst aus der uebergebenen Datei
// Daten ein und erzeugt daraus Musik-Objekte, die sie in einem Array
// zusammenfasst und diesen dann zurueckgibt.
//
// Sie muessen diese Klasse nicht im Detail verstehen, um die Aufgabe
// bearbeiten zu koennen.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Parser {

  public static Musik[] readMusik(String f) {
    System.out.print("Lese Verfuegbare Songs aus Datenbank " + f + " ein... ");

    try {
      // Daten lesen
      BufferedReader br = new BufferedReader(new FileReader(f));
      LinkedList<String> lines = new LinkedList<String>();
      String line = null;
      while ((line = br.readLine()) != null) {
        lines.add(line); // gelesene Zeile dem Zeilen-Array hinzufuegen
      }
      br.close();

      // Daten verarbeiten
      Musik[] readInTitle = new Musik[lines.size()];
      for (int i = 0; i < lines.size(); i++) {
        String[] elemente = lines.get(i).split(","); // Zeile an Kommas auftrennen
        Musik a = new Musik(
          elemente[0].trim(),
          elemente[1].trim(),
          elemente[2].trim(),
          Integer.parseInt(elemente[3].trim()),
          elemente[4].trim()
        );
        readInTitle[i] = a; // Musikobjekt dem Array hinzufuegen
      }

      // Array zurueckgeben
      return readInTitle;
    } catch (IOException e) {
      System.err.println("Fehler beim Daten einlesen: " + e.getMessage());
    }
    return null; // Fehlerfall
  }

}
