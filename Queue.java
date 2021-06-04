import java.util.LinkedList;

public class Queue {
    private LinkedList liste;

    public Queue(){
        liste = new LinkedList();
    }

    public void enqueue(Film data){
        liste.addLast(data);
    }

    public Film dequeue(){
        if (liste.size()>0){
        return (Film) liste.removeFirst();
        }else return null;
    }

    public Film peek(){
        if (liste.size()>0){
        return (Film) liste.getFirst();
        }else return null;
    }
}
