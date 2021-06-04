import java.util.LinkedList;
public class Stack <T> {
    private LinkedList liste;

    public Stack(){
        liste = new LinkedList();
    }

    public void push(T obj){
        liste.addLast(obj);
    }

    public T pop(){
        if (liste.size()>0){
        return (T) liste.removeLast();
        }else return null;
    }

    public T top(){
        if (liste.size()>0){
            return (T) liste.getLast();
        }else return null;
    }
}
