public class TestStack  {
    public static void main(String[] args){
        Stack array = new Stack();

        array.push(1);
        System.out.println(array.top());
        array.push("dd");
        System.out.println(array.top());
        array.push(6.4);
        System.out.println(array.top());
        array.push(54);
        System.out.println(array.top());
        array.push("wew");
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());
        array.pop();
        System.out.println(array.top());

    }
}

