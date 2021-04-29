public class KaraokeBar {
  public static void main(String[] args) {
    // Einlesen der Songs in einem Array
    String file = "music.db";
    Musik[] angebot = Parser.readMusik(file);

    if(angebot == null) {
      System.out.println("Initialisierung fehlgeschlagen, Daten der Datei " + file + " fehlen. Beende Programm.");
      return;
    }

    System.out.println("\n");
    System.out.println("\t ,_______________________________________,");
    System.out.println("\t/   HHH*                          *HHH   /.");
    System.out.println("\t`---------------------------------------\" :");
    System.out.println("\t| +                                   + | :");
    System.out.println("\t|             .____________.            | :");
    System.out.println("\t|       .++.  |######\\  /##|  .++.      | :");
    System.out.println("\t|       +  +  |######/  \\##|  +  +      | :");
    System.out.println("\t|       '++'  '------------'  '++'      | :");
    System.out.println("\t|    Java Karaoke Bar UltimateX Pro+    | :");
		System.out.println("\t|             Limited Edition           | :");
		System.out.println("\t|                                       | :");
    System.out.println("\t|      /'''''''''''''''''''''''''\\      I :");
    System.out.println("\t|     /     o       0         o   \\     I :");
    System.out.println("\t|+   / O                         O \\   +|,'");
    System.out.println("\t`---------------------------------------`");
    System.out.println();

    System.out.println("Herzlich Willkommen bei Java Karaoke Bar UltimateX Pro+");
    System.out.println("Ihre professionelle Musikdatenbankverwaltung!");
    System.out.println();

    // Bedienungshinweise
    System.out.println("[Mit 's' kann ein Titel gesucht werden.]");
    System.out.println("[Mit 'q' kann das Programm beendet werden.]");
    System.out.println();

    // Dauerschleife mit Aktionsauswahl pro Schleifendurchlauf
    char aktion = 0;
    while(true) {
      System.out.println();
      System.out.println("Unser ueberschaubares Angebot:");
      System.out.println();
      System.out.format("%1$20s | %2$30s | %3$25s | %4$10s", "Titel", "Interpret", "Album", "Release");
      System.out.println();
      System.out.println("______________________________________________________________________________________________");
      for(int i = 0; i < angebot.length; ++i) {
        System.out.format("%1$20s | %2$30s | %3$25s | %4$10s",
          angebot[i].titel, angebot[i].interpret, angebot[i].album, angebot[i].erscheinungsdatum);
        System.out.println();
      }
      System.out.println();
      aktion = Terminal.askChar("Bitte waehlen Sie [s/q]: ");
      System.out.println();
      if(aktion == 's') {
        // Da der Warenbestand nach Erscheinungsdatum sortiert ist, bitten wir den Nutzer um das Erscheinungsdatum statt den Titel
        String suchdatum = Terminal.askString("Bitte geben Sie den Erscheinungsdatum des gewaehlten Titels ein: ");
        Musik suchmuster = new Musik(null, null, null, 0, suchdatum); // Dummy-Song mit Datum
        int titelindex = Suche.binareSuche(suchmuster, angebot); // suchen lassen
        System.out.println();
        if(titelindex != -1) {
          System.out.println("Sie interessieren sich fuer folgenden Song: ");
          System.out.println(angebot[titelindex]);
          System.out.println("\n");
          System.out.println("\n");
          System.out.println("\t ,_______________________________________,");
          System.out.println("\t/   HHH*                          *HHH   /.");
          System.out.println("\t`---------------------------------------\" :");
          System.out.println("\t| +                                   + | :");
          System.out.println("\t|             .____________.            | :");
          System.out.println("\t|       .++.  |######\\  /##|  .++.      | :");
          System.out.println("\t|       +  +  |######/  \\##|  +  +      | :");
          System.out.println("\t|       '++'  '------------'  '++'      | :");
          System.out.println("\t|    Java Karaoke Bar UltimateX Pro+    | :");
      		System.out.println("\t|   BITTE WARTEN, SONG WIRD GELADEN...  | :");
      		System.out.println("\t|                                       | :");
          System.out.println("\t|      /'''''''''''''''''''''''''\\      I :");
          System.out.println("\t|     /     o       0         o   \\     I :");
          System.out.println("\t|+   / O                         O \\   +|,'");
          System.out.println("\t`---------------------------------------`");
          System.out.println();
          System.out.println();
          System.out.println("\tHinweis: Aufgrund technischer Stoerungen steht der Musikplayer nicht zur Verfuegung.");
          System.out.println("\t         Wir bitten um Ihr Verstaendnis.");
          System.out.println();
          Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
        } else {
          System.out.println("Es wurde kein Titel mit diesem Erscheinungsdatum gefunden.\n");
          Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
        }
        aktion = 0;
        continue;
      } else if(aktion == 'q') {
        System.out.println("Programm wird beendet.");
        aktion = 0;
        return;
      } else {
        System.out.println("Ungueltige Eingabe.");
        Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
        aktion = 0;
        continue;
      }
    }
  }
}
