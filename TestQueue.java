public class TestQueue {
    public static void main(String[] args){
        Queue filme = new Queue();
        filme.enqueue(new Film("Krieg der Sterne", 3.45, 125, "Science-Fiction Film...",
                "1978-02-09"));
        System.out.println(filme.peek());
        filme.enqueue(new Film("Jurrasic Park", 2.00, 123, "Abendheuerfilm...",
                "1993-06-11"));
        System.out.println(filme.peek());
        filme.enqueue(new Film("Harry Potter und der Stein der Weisen", 2.79, 155,
                "Fantasyfilm...", "2001-11-22"));
        System.out.println(filme.peek());
        filme.dequeue();
        System.out.println(filme.peek());
        filme.dequeue();
        System.out.println(filme.peek());
        filme.dequeue();
        System.out.println(filme.peek());
        filme.dequeue();


    }
}
