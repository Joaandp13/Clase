package brawlstars;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int opciomenu = menuinicial();

            switch (opciomenu) {
                case 1:
                    exercici1();
                    break;
                case 2:
                    exercici2();
                    break;
            }
        }catch(Exception e){System.out.println("Error: "+e);
        }



    }
    static int menuinicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el numero del exercici: "+"\n");
        System.out.println("Exercici 1 "+"\n");
        System.out.println("Exercici 2 "+"\n");
        System.out.println("Exercici 3 "+"\n");
        return sc.nextInt();

    }

    public static void exercici1()throws Exception{
        File tournament = new File("./Tournaments.stats");
        File lowscore = new File("./LowScore.stats");
        if(!tournament.exists()){
            throw new Exception("El fitxer "+tournament.getPath()+" no existeix");
        }
        else{

            if(!(FileUtils.sizeOf(tournament)>320)){
                String contingut = FileUtils.readFileToString(tournament,"UTF-8");

                String[] linies = contingut.split("\n");

                for(int i = 1; i<linies.length;++i){
                    String[] temp = linies[i].split(";");
                    int score = Integer.parseInt(temp[5]);
                    if(score<=70){
                        FileUtils.writeStringToFile(lowscore,linies[i],"UTF-8");

                    }
                }
            }
        }
    }

    public static void exercici2() throws Exception{
        File test = new File("src/brawlstars/Tournaments.stats");
        System.out.println(test.getAbsolutePath());
        //File tournament = new File("Tournaments.stats");
        String contingut = FileUtils.readFileToString(test,"UTF-8");

        String[] linies = contingut.split("\n");

        for(int i = 1; i<linies.length;++i){
            String[] temp = linies[i].split(";");
            File ruta = new File("src/brawlstars/Brawlers"+"/"+temp[1]+"/"+temp[2]+"/"+temp[0]);
            FileUtils.forceMkdir(ruta);
        }
    }
}
