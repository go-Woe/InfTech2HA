public class Fakultaet {
    public int n;

    public Fakultaet() {

    }

    public static int fakultaetIterativ(int n){
        if (n<0){
            return  -1;
        }else{
            int f=1;
            while (n>0){
                f=f*n;
                n--;
            }return f;
        }
    }
    public int fakultaetRekursiv(int n){
        if (n<0) return -1;
        if (n==0 || n==1) return 1;
        else{
            return fakultaetRekursiv(n-1)*n;
        }
    }
}
