package Fitxers;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystems;
import java.nio.file.FileStore;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;




public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcio;
        System.out.print("Introdueix l'acció a executar: ");

        do {
            System.out.println("\nMenú d'opcions:");
            System.out.println("1. Obtenir informació sobre arxius i carpetes I");
            System.out.println("2. Obtenir informació sobre arxius i carpetes II");
            System.out.println("3. Obtenir informació sobre una ruta");
            System.out.println("4. Mostrar informació general dels sistemes d'arxius");
            System.out.println("5. Obtenir informació dels sistemes d'arxius");
            System.out.println("6. Mostrar el contingut d'una carpeta");
            System.out.println("7. Crear i modificar l'estructura de proves");
            System.out.println("8. Treballar en un directori per defecte");
            System.out.println("9. Utilitzar funcions amb un nombre variable d'arguments");
            System.out.println("10. Utilitzar llibreries externes");
            System.out.println("0. Sortir");
            System.out.print("Introdueix el número de l'acció a executar: ");
            opcio = scanner.nextInt();
            scanner.nextLine();
            File arx;
            switch (opcio) {

                case 1:
                    System.out.println("Introdueix la ruta a la qual obtenir info: ");
                    arx = new File(scanner.nextLine());
                    if(!arx.exists()){
                        System.out.println("El fitxer/carpeta no existeix.");
                        break;
                    }
                    System.out.println((arx.isDirectory()?"D":"-")
                            +(arx.isHidden()?"H":"-")
                            +(arx.canRead()?"R":"-")
                            +(arx.canWrite()?"W":"-")
                            +(arx.canExecute()?"X":"-"));
                    break;
                case 2:
                    System.out.println("Introdueix la ruta a la qual obtenir info: ");
                    arx = new File(scanner.nextLine());
                    try{System.out.println("Ultima modificació: "+lastMod(arx));}catch(Exception e){System.out.println("Error: " +e );}

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;

                case 10:

                    break;
                default:
                    System.out.println("Acció no reconeguda: " + opcio);
            }
            scanner.nextLine();
        } while (opcio !=0);

    } //fi main
    public static String lastMod(File f)throws Exception{
        if(!f.exists()){
            throw new Exception("El fitxer/carpeta no existeix.");

        }

        long ultimamodificacio = f.lastModified();
        Date data = new Date(ultimamodificacio);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
        String dataFormateada = sdf.format(data);
        return dataFormateada;
    }
} //fi programa
