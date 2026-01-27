package Genshin;

import java.util.Scanner;


public class BuildMenu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        BuiltCharacter.loadBuilds();

        System.out.println("===SELECCIONA UN PERSONATGE===");

        for(int i=0; i<BuiltCharacter.builds.size(); ++i){
            System.out.println((i + 1)+ "." +
                    BuiltCharacter.builds.get(i)
                            .getCharacter().name);
        }

        System.out.print("Escull un personatge: ");
        int opcioChar = sc.nextInt() - 1;

        if (opcioChar < 0 || opcioChar>= BuiltCharacter.builds.size()){
            System.out.println("Opció invalida");
            return;
        }

        BuiltCharacter selected =
                BuiltCharacter.builds.get(opcioChar);

        System.out.println("\nQue vols veure?"
                +"\n1. Especificacions del personatge"
                +"\n2. Especificacions del arma"
                +"\nOpció: ");
        int subelecciochar = sc.nextInt();

        if (subelecciochar ==1){
            System.out.println(selected.getCharacter());
        } else if (subelecciochar == 2){
            System.out.println(selected.getWeapon());
        } else {
            System.out.println("Opció invalida");
        }

    }
}
