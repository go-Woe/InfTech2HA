public class LinkedList {
    
    //Attribute
    private ListElem first;
    private ListElem last;

    private class ListElem {
        Film data;
        ListElem next;
  
        ListElem(Film data) {
            this.data = data;
            this.next = null;
        }

        ListElem(Film data, ListElem next) {
            this.data = data;
            this.next = next;
        }
    }

    //Konstruktor erzeugt eine leere Liste
    public LinkedList() {  
        first = null;
        last = null;
    }

    // Methoden
    public Film getFirst(){
        if (first==null) return null;
        return first.data;
    }
    public Film getLast(){
        if (last==null) return null;
        return last.data;
    }
    public Film get(int pos){
        int i=0;
        for (ListElem el = first;el != null;el=el.next){//Liste wird durchlaufen
            if (i==pos) return el.data;//wenn die vorgegebene Pos erreicht wurde wird data zurück gegeben
            i++;
        }return null;                                   //wenn der Index auserhalb der Liste liegt
    }
    public void addFirst(Film obj){
        first = new ListElem(obj,first);//erstes Element wird neu definiert
        if (last == null)last = first;  //wenn die Liste leer ist
    }
    public void addLast(Film obj){
        if (first==null) {                      //wenn die Liste leer ist
            addFirst(obj);
            return;
        }
        last.next = new ListElem(obj,null);//noch letztes Element zeigt jetzt auf übergebenes Element
        last = last.next;     //letztes element ist jetzt übergebenes Element
    }
    public void add(Film obj, int pos){
        if (pos==0||first==null) {                      //leere Liste oder am Anfang einfügen
            addFirst(obj);
            return;
        }
        if (pos == 1 || first.next==null){              //EinelementigeListe oder an Pos 1 einfügen
            first.next = new ListElem(obj,first.next);
            if (last == first){
                last = first.next;
            }
            return;
        }
        int i=0;
        ListElem el = first;
        while (el != null){                             //läuft einmal die Liste durch
            if(i==pos){                                 //überprüft ob die vorgegebene Pos erreicht wurde
                el= new ListElem(obj,el);
                return;
            }
            el=el.next;
            i++;
        }
        last = el.next;
    }
    public Film removeFirst(){
        if (first == null) return null;     //wenn die Liste leer ist
        Film el =first.data;                 //first wird zwischen gespeichert
        first = first.next;                 //first wir durch nächstes ersetzt und so removed
        return el;
    }
    public Film removeLast(){
        if (first == null) return null;
        if (first.next == null){
            Film el = first.data;
            first = null;
            last = null;
            return el;
        }
        ListElem el = first;
        while (el != last) el = el.next;
        Film temp = last.data;
        el.next = null;
        last = el;
        return temp;
    }
    public Film remove(int pos){
        if (first == null) return null;
        if (first.next == null){
            if ((pos == 0)){
                Film el = first.data;
                first = null;
                last = null;
                return el;
            }
            return null;
        }
        ListElem el = first;
        ListElem vel = null;
        int i = 0;
        while (el != last){
            if (pos == i){
                Film temp = el.data;
                vel.next = el.next;
                return temp;
            }
            vel = el;
            el = el.next;
            i++;
        }
        if (pos == i){
            Film temp = el.data;
            el = null;
            last = vel;
            return temp;
        }
        else return null;
    }
    public boolean isEmpty(){
        if (first == null) return true;
        else return false;
    }
    public int size(){
        if (first == null)return 0;
        int size = 1;
        ListElem el = first;
        while (el.next != null){
            el = el.next;
            size++;
        }
        return size;
    }
    public int[] findVal(Film val){
        if (first == null) {
            int[] array = new int[0];
            return array;
        }
        int[] array = new int[0];
        ListElem el = first;
        int i = 0;
        while (el.next != null){
            if (el.data == val) {
                int [] temp = array;
                //int [] temp =new  int[array.length-1];
                //for (int j=0;j<array.length;j++)temp[j]=array[j];
                array = new  int[array.length+1];
                for (int j = 0 ;j < temp.length; j++)array[j] = temp[j];
                array[array.length-1]=i;
            }
            i++;
            el = el.next;
        }
        return array;
    }
    public int findElem(Film obj) {
        ListElem el = first;
        int i = 0;
        while (el.next != null) {
            if (el.data == obj) {
                return i;
            }
            i++;
            el = el.next;
        }
        return -1;
    }
    // TODO...
}
