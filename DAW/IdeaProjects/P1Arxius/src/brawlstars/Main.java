package brawlstars;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;
public class Main{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(
                    "1.Esborrar carpeta" +
                            "\n2.Crear carpeta" +
                            "\n3.Copiar estructura carpeta" +
                            "\n4.Crear fitxers" +
                            "\n5.Moure/Renombrar fitxer" +
                            "\n6.Elegir linies d'un fitxer" +
                            "\n7.Guardar contingut de Brawlers.txt" +
                            "\n8.Comptar paraules a Brawlers.txt" +
                            "\n9.Mostrar recompenses d'un jugador" +
                            "\n10.Generar recompenses especials" +
                            "\n0.Acabar" +
                            "\nSelecciona una opció (0-10): "
            );
            int opcio = sc.nextInt();
            try {
                switch (opcio) {
                    case 1:
                        func1();
                        break;
                    case 2:
                        func2();
                        break;
                    case 3:
                }
            }catch(Exception e){System.out.println("Error: "+e);}
        }
    }
    public static void func1()throws Exception{
        File brawlers = new File("./Brawlers");
        if(brawlers.exists()){
            FileUtils.deleteDirectory(brawlers);
            System.out.println("Directori esborrat correctament.");
        }
        else{throw new Exception("No existeix el directori. ");}
    }
    public static void func2()throws Exception{
        File Tank = new File("./Brawlers/Tank");
        File Legendary = new File (Tank+"/Legendary");
        File Epic = new File (Tank+"/Epic");
        if(Tank.exists()){
            System.out.println("La carpeta Tank ja existeix. ");
            if(FileUtils.directoryContains(Tank,Legendary)){
                boolean legflag = true;
            }
            else if(FileUtils.directoryContains(Tank,Epic)){
                boolean epicflag = true;
            }
            else {FileUtils.forceMkdir(Tank);
            F}
        }


    }


}
