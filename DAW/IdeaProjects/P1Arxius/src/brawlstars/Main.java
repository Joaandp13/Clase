package brawlstars;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static Scanner sc = new Scanner(System.in);
    static boolean running = true;
    public static void main(String[] args){

        while(running) {
            System.out.println(
                    """
                            
                            --------MENU--------\
                            
                            1.Esborrar carpeta\
                            
                            2.Crear carpeta\
                            
                            3.Copiar estructura carpeta\
                            
                            4.Crear fitxers\
                            
                            5.Moure/Renombrar fitxer\
                            
                            6.Elegir linies d'un fitxer\
                            
                            7.Guardar contingut de Brawlers.txt\
                            
                            8.Comptar paraules a Brawlers.txt\
                            
                            9.Mostrar recompenses d'un jugador\
                            
                            10.Generar recompenses especials\
                            
                            0.Acabar\
                            
                            Selecciona una opció (0-10):\s"""
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
                        func3();
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.println("Introdueix la ruta a la que vols crear els arxius: ");
                        File ruta = new File(sc.nextLine());
                        File[] arxius = func4A();

                        func4B(ruta.getPath(), arxius);
                        break;
                    case 0:
                        System.out.println("""
            ████████╗ █████╗ ███╗  ██╗ ██████╗ █████╗ ███╗  ██╗████████╗
               ██╔══╝██╔══██╗████╗ ██║██╔════╝██╔══██╗████╗ ██║╚══██╔══╝
               ██║   ███████║██╔██╗██║██║     ███████║██╔██╗██║   ██║   
               ██║   ██╔══██║██║╚████║██║     ██╔══██║██║╚████║   ██║   
               ██║   ██║  ██║██║ ╚███║╚██████╗██║  ██║██║ ╚███║   ██║   
               ╚═╝   ╚═╝  ╚═╝╚═╝  ╚══╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚══╝   ╚═╝    
                                                              
            """);
                        running = false;
                        for(int i= 0;i<3;++i){
                            Thread.sleep(600);
                            System.out.println(".");
                        }
                        break;

                }
            }catch(Exception e){System.out.println("Error: "+e);}
            sc.nextLine();
        }
    }

    public static void func1()throws Exception{
        File brawlers = new File("./Brawlers");
        if(brawlers.exists()){
            FileUtils.deleteDirectory(brawlers);
            System.out.println("Directori esborrat correctament.");
        }
        else{throw new Exception("No existeix el directori Brawlers. ");}
    }


    public static void func2()throws Exception {

        boolean creardir = true;
        while (creardir) {
            System.out.print("Introdueix la ruta del directori que vols crear:  ");

            File directori = new File(sc.next());

            if (!directori.exists()) {
                FileUtils.forceMkdir(directori);
                System.out.println("Directori creat correctament.");
            } else {
                throw new Exception("El directori ja existeix.");
            }
            System.out.println("Vols crear un altre directori? S/N");
            if (sc.next().equalsIgnoreCase("N")) {
                creardir = false;
            }
        }
    }




    public static void func3()throws Exception{

        System.out.println("Introdueix el directori que vols copiar: ");
        File directoriorigen = new File(sc.next());
        if (!directoriorigen.exists()) {
            throw new Exception("El directori no existeix.");
        }
        System.out.println("Introdueix on vols copiar el directori Ex: ./Exemple/[Nom Nou] : ");
        File directoridesti = new File(sc.next());
        if (directoridesti.exists()) {
            throw new Exception("El directori "+ directoridesti+  " ja existeix. ");
        }
        FileUtils.copyDirectory(directoriorigen, directoridesti);
        System.out.println("Directori copiat correctament.");
    }
    public static File[] func4A() throws Exception {
        ArrayList<File> filelist = new ArrayList<>();
        boolean input = true;

        while (input) {
            System.out.print("Introdueix el nom del fitxer per crear (buit per cancelar): ");
            String nom = sc.nextLine();
            if (nom.isEmpty()) {
                input = false;
            }

            else if (filelist.contains(new File(nom))) {
                throw new Exception("Fitxer ja introduït.");
            }

            else {
                filelist.add(new File(nom));
            }
        }
        return filelist.toArray(new File[0]);
    }


    public static void func4B(String Ruta, File[] noms)throws Exception{
        for (File nom : noms) {
            File a = new File(Ruta, nom.getName());

            if (a.exists()) {
                throw new Exception("El fitxer " + nom.getName() + " ja existeix.");
            }

            FileUtils.forceMkdir(a);
            System.out.println("Fitxer creat: " + a.getPath());
        }
    }
    }





