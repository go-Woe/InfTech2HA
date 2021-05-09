public class SortierenQuicksort {
    static public int vertauschung;
    static public int aufrufec;

    public static void quickSort(Comparable[] f) {
        vertauschung = 0;
        aufrufec = 0;
        quicksort(f,0,f.length-1);
}
    public static void quicksort(Comparable[] f, int von, int bis) {
        if (von < bis) {
            int pelement = bis;
            int grenzindex = 0;
            for (int laufindex = 0; laufindex <= bis;laufindex++) {
                if (f[laufindex].compareTo(f[pelement]) < 0) {
                    if (laufindex!=grenzindex) {
                        tauschen(f, laufindex, grenzindex);
                    }grenzindex++;

                }
            }
            tauschen(f, grenzindex, pelement);
            quicksort(f, von, grenzindex - 1);
            quicksort(f, grenzindex + 1, bis);
        }
    }
    public static void tauschen(Comparable[] f, int index1, int index2){
        Comparable temp=f[index1];
        f[index1]=f[index2];
        f[index2]=temp;

        vertauschung++;
    }
}
