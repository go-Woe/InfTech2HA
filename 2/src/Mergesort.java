public class Mergesort {

    // von aussen zugreifbare Sortier-Methode
    public static void sort(String[] arr) {
        int length = arr.length;
        String [] g = new String[length];
        teilen(arr,g,0,length-1);
    }
    public  static void teilen(String[] arr,String[] g, int von, int bis){
        if (von <bis){
            int mitte = (von+bis+1)/2;          //Mitte berechnen
            teilen(arr, g, von, mitte-1);   //aufteilen in unteren
            teilen(arr, g, mitte, bis);         //und oberen Part
            vergleich(arr,g,von,mitte, bis);    //sobald nurnoch ein Element im Array ist wird angefangen zu vergleichen
        }
    }
    public static void vergleich (String[] string1,String[] string2,int von, int mitte, int bis){
        int j = mitte;
        int i = von;
        for (int k=von;k<=bis; k++){
            if (i <= mitte-1 && j <= bis) {
                if (string1[i].compareTo(string1[j]) <= 0){   //Vergleich
                    string2[k]=string1[i++];
                }else{
                    string2[k]=string1[j++];
                }
            }else{  //ein Array ist bereits vollständig durchlaufen
                if (i <= mitte-1){
                    string2[k]=string1[i++];
                }else{
                    string2[k]=string1[j++];
                }
            }
        }
        for (int a =von;a <= bis; a++){ //alles in einen Array wieder
            string1[a]=string2[a];
        }
    }


}
