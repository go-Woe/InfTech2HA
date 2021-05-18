public class TestMergesort {
    public static void main(String[] args){
     String[] array = new String[6];
        array[0]="g";
        array[1]="m";
        array[2]="f";
        array[3]="e";
        array[4]="w";
        array[5]="q";
        Mergesort.sort(array);
        for (int i=0 ;i<array.length; i++ ){
         System.out.println(array[i]);
        }
    }

}
