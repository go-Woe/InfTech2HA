public class Baum {
    private String[] knoten;

    public Baum(String[] data){
        this.knoten = data;
    }

    public void printInorder(){
        printInorder(0);
    }

    public void printPreorder(){
        printPreorder(0);
    }

    public void  printPostorder(){
        printPostorder(0);
    }

    public void printInorder(int i){
        if (i< knoten.length){
            printInorder( getLeftChild(i));
            System.out.print(getNode(i)+" ");
            printInorder(getRightChild(i));
        }
    }

    public  void printPreorder(int i){
        if (i< knoten.length){
            System.out.print(getNode(i)+" ");
            printPreorder( getLeftChild(i));
            printPreorder(getRightChild(i));
        }
    }

    public void printPostorder(int i) {
        if (i < knoten.length) {
            printPostorder(getLeftChild(i));
            printPostorder(getRightChild(i));
            System.out.print(getNode(i) + " ");
        }
    }
    public String getNode(int i){
        if (i< knoten.length) return knoten[i];
        else return null;
    }

    private int  getLeftChild(int i) {
        return 2*i+1;
    }
    private int getRightChild(int i){
        return 2*i+2;
    }
}
