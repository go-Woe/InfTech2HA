public class TestLinkedList {

    // Bekommt eine LinkedList uebergeben und printet alle Elemente auf die Konsole
    public static void printList(LinkedList list){
        int size = list.size();
        for (int i = 0; i < size; i++) {

            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }

    // Testet die Methoden von LinkedList
    public static void main(String[] args){

        // LinkedLists erzeugen
        LinkedList filme = new LinkedList();
        
        // Listen fuellen
        filme.addLast( 
                new Film("Krieg der Sterne", 3.45, 125, "Science-Fiction Film...", "1978-02-09")
        );
        filme.addLast(
                new Film("Jurrasic Park", 2.00, 123, "Abendheuerfilm...", "1993-06-11")
        );
        filme.addLast(
                new Film("Harry Potter und der Stein der Weisen", 2.79, 155, "Fantasyfilm...", "2001-11-22")
        );
        Film hdr_1 = new Film("Der Herr der Ringe: Die Gefährten", 3.29, 228, "Fantasyfilm...", "2001-12-19");
        filme.addLast(hdr_1);
        filme.addLast(new Film("Harry Potter und die Kammer des Schreckens", 2.09, 161, "Fantasyfilm...", "2002-11-14"));

        // TODO...
        // Get-Methoden
        System.out.println("Anfang der Liste: " + filme.getFirst());
        System.out.println();
        System.out.println("Ende der Liste: " + filme.getLast());
        System.out.println();
        System.out.println("Das dritte element der Liste" + filme.get(3));
        System.out.println();
        //add-Methoden
        filme.addLast(new Film("Harry Potter und der Gefangene von Askaban", 3.17, 142, "Fantasyfilm...", "2004-06-03"));
        filme.addFirst(new Film("Harry Potter und der Feuerkelch", 2.19, 157, "Fantasyfilm...", "2005-11-16"));
        filme.add(new Film("Harry Potter und der Orden des Phönix", 2.99, 138, "Fantasyfilm...", "2007-07-12"),4);
        //remove-Methoden
        System.out.println("Der letzte Film wird entfernt " + filme.removeLast());
        System.out.println();
        System.out.println("Der erste Film wird entfernt " + filme.removeFirst());
        System.out.println();
        System.out.println("Der vierte Film wird entfernt " + filme.remove(4));
        System.out.println();
        //isEmpty
        System.out.println("Ist die Liste leer: "+filme.isEmpty());
        System.out.println();
        //size
        System.out.println("Die Liste hat "+filme.size()+" Elemente");
        System.out.println();
        //findVal
        filme.findVal(hdr_1);
        //findElem
        System.out.println("Der Film 'Der Herr der Ringe: Die Gefährten' befindet sich an Position " + filme.findElem(hdr_1));

    }
    /*Komplexitätsbetrachtung
    public Film getFirst()                          O(1)
    public Film getLast()                           O(1)
    public void addLast(Film obj)                   O(1)
    public Film removeLast()                        O(n)
    public boolean isEmpty()                        O(1)
    public int size()                               O(n)
    public Film get(int pos)                        O(1)
    public int findElem(Film obj)                   O(n)
    public static void printList(LinkedList list)   O(n^2)


     */

}
