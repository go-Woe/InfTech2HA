public class TestFakultaet {
    public static void main(String args[]){
        Fakultaet n= new Fakultaet();
        System.out.println("FakultaetIterativ: ");
        System.out.println("Die Fakultaet von 4 ist "+Fakultaet.fakultaetIterativ(4)+" und die von 7 ist "+
                Fakultaet.fakultaetIterativ(7));
        System.out.println();
        System.out.println("FakultaetRekusiv: ");
        System.out.println("Die Fakultaet von 4 ist "+n.fakultaetRekursiv(4)+" und die von 7 ist "+
                n.fakultaetRekursiv(7));
    }
}
