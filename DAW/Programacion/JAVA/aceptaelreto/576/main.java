import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mindef, numdef;
        int hores, minuts, segons;
        int totalSegons;

        
        mindef = sc.nextInt();

        while (mindef != 0) {
            totalSegons = 0; // reiniciamos acumulador

            System.out.println();
            numdef = sc.nextInt();

            while (numdef != 0) {
                totalSegons += mindef * numdef; // acumulamos los segundos

                
                numdef = sc.nextInt();
            }

            // convertir total Segons a hores, minuts i segons
            hores = totalSegons / 3600;
            minuts = (totalSegons % 3600) / 60;
            segons = totalSegons % 60;

            System.out.printf("%02d:%02d:%02d%n", hores, minuts, segons);


            
            mindef = sc.nextInt();
        }

        sc.close();
    }
}
