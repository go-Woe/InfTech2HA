import java.util.Iterator;

public class TestMatrixIterators {
    public static void main (String[] args){
        String[][] x = {{"1","2","3","4"},{"5","6","7","8"},{"3","4","5","9"}};
        Matrix<String> matrix = new Matrix<>(x);

        Character[][] m = {{'s','d','g','f'},{'w','a','q','e'}};
        Matrix<Character> matrix2 = new Matrix<>(m);
        matrix2.setIteratorMode('r');

        Iterator<String> iter = matrix.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());

        String result="";
        for (String elem:matrix) {
            result += elem+", ";
        }
        System.out.println(result+"\n");
    }
}
