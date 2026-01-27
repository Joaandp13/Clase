import java.util.Objects;
import java.util.Scanner;
public class sixofive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ropa = "";
        int I = 0;
        int V = 0;
        ropa = sc.next();
        while (!Objects.equals(ropa,".")) {
            while (!Objects.equals(ropa, ".")) {
                if (Objects.equals(ropa, "I")) {
                    ++I;
                } else ++V;
                ropa = sc.next();


            }
            if (V>I){System.out.println("VERANO");} else if (I>V){System.out.println("INVIERNO");}
            else {System.out.println("EMPATE");}
            ropa = sc.next();

        }

        }

}
