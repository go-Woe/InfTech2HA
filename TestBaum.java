public class TestBaum {
    public static void main(String[] args) {
        String[] knoten = {"O", "G", "N", "C", "F", "J", "M", "A", "B", "D", "E", "H", "I", "K", "L"};
        Baum baum = new Baum(knoten);

        baum.printInorder();
        System.out.println();
        baum.printPreorder();
        System.out.println();
        baum.printPostorder();
    }
}
