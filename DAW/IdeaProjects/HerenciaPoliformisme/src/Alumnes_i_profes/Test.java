package Alumnes_i_profes;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Membre[] membres = new Membre[4];
        try {
            membres[0] = new Alumne("Marc", "Garcia Lopez", new Data(15, 3, 2005), "ESO", 1);
            membres[2] = new Alumne("Laura", "Martínez Pérez", new Data(20, 7, 2004), "BTX", 2);
            membres[1] = new Professor("Joan", "Santos Ruiz", new Data(10, 5, 1980), "Informàtica", true);
            membres[3] = new Professor("Anna", "Vidal Torres", new Data(2, 11, 1975), "Lletres", false);
        } catch (Exception e) {
            System.out.println("Error creant membre: " + e.getMessage());
        }
        for(Membre m : membres){
            if(m instanceof Alumne){
                System.out.println(m);
            }else if (m instanceof  Professor){
                System.out.println(m);
            }

        }
    }
}
