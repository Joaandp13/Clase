import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args){
        Stack<Integer> Pila = new Stack<>();
        Queue<Integer> Cua = new LinkedList<>();

        int[] elements = {1,2,3,4,5};

        for(int e : elements){
            Pila.push(e);
            Cua.offer(e);

        }

        System.out.println("PRIMERS ELEMENTS");
        System.out.println("PILA "+Pila.peek());
        System.out.println("CUA "+Cua.peek());


        System.out.println("ELEMENTS PILA: ");
        while(!Pila.isEmpty()){
            System.out.println(Pila.pop());

        }

        System.out.println("ELEMENTS CUA: ");
        while(!Cua.isEmpty()){
            System.out.println(Cua.poll());
        }
    }
}
