/*public class SortierenQuicksort {
    static public int vertauschung;
    static public int aufrufec;

    public static void quickSort(Comparable[] f) {
        vertauschung = 0;
        aufrufec = 0;
        quicksort(f,0,f.length-1);
    }
    public static void quicksort(Comparable[] f, int von, int bis){
        if (von < bis) {

            int i = aufteilen(f,von,bis);
            quicksort(f, von, i-1);
            quicksort(f,i+1,bis);

        }
    }
    private static int aufteilen(Comparable[] f, int von, int bis) {
        int grenzindex = von;
        tausch(f,grenzindex,bis);

        for (int i = von; i < bis-1; i++) {
            aufrufec++;
            if(f[i].compareTo(f[bis]) < 0) {
                tausch(f,grenzindex,i);
                grenzindex++;
            }
        }
        tausch(f, grenzindex, bis);
        return grenzindex;
    }
    public static void tausch(Comparable[] f, int index1, int index2){
        Comparable temp=f[index1];
        f[index1]=f[index2];
        f[index2]=temp;

        vertauschung++;
    }
}*/