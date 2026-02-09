package Alumnes_i_profes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introdueix una data DD-MM-AAAA");
            Data d1 = new Data(sc.nextLine());
            System.out.println(d1);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
