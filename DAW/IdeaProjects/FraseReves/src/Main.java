import java.util.Stack;
import java.util.Scanner;
class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> Frase = new Stack<>();
        boolean running = true;

        while(running){
            System.out.println("INTRODUEIX LA SEGÜENT PARAULA. ");
            String paraula = sc.nextLine();
            if(paraula.equals(".")){
                running = false;

            }
            else{Frase.push(paraula);}

        }
        while(!Frase.isEmpty()){
            System.out.println(Frase.pop());
        }

    }
}
