package Domus;
import Model.*;
import Vista.*;
public class Main {

    public static void main(String args[]){
        Vista vista =new Vista();
        ModelHabitatge model = new ModelHabitatge();
        boolean programarunning = true;
        int opcio;
        int subopcio;
        while(programarunning){
            opcio=0;
            subopcio=0;

            vista.mostrarmenuinicial();
            try {
                opcio=vista.askOpcio("Introdueix la teva opció");
                if(opcio<1||opcio>4)throw new Exception("Ha de ser una de les opcions esmentades");
                switch(opcio){
                    case  1:
                        vista.submenu1();
                        model.AfegirHabitatge(new Casa("Carrer Major 1", "Joan", 600000, true));
                        model.AfegirHabitatge(new Casa("Carrer Pau 2", "Maria", 750000, false));
                        model.AfegirHabitatge(new Casa("Carrer Lluna 3", "Pere", 500000, true));
                        model.AfegirHabitatge(new Casa("Carrer Sol 4", "Anna", 800000, false));

                        // Excepcio preu
                        model.AfegirHabitatge(new Casa("Carrer Estrella 5", "Marc", 450000, true));

                        model.AfegirHabitatge(new Pis("Carrer Font 1", "Laura", 300000, true, 3));
                        model.AfegirHabitatge(new Pis("Carrer Riu 2", "Jordi", 350000, false, 2));

                        // Excepcio ascensor y planta
                        model.AfegirHabitatge(new Pis("Carrer Mar 3", "Clara", 400000, false, 5));

                        model.AfegirHabitatge(new Pis("Carrer Bosc 4", "Eric", 250000, true, 1));
                        model.AfegirHabitatge(new Pis("Carrer Parc 5", "Sofia", 270000, true, 2));
                    case 2:
                        String propietari =vista.askString("Introdueix el nom del propietari a buscar: ");
                        String adreca=vista.askString("Introdueix la adreça a buscar: ");
                        Habitatge h=model.buscarHabitatge(propietari,adreca);
                        if(h==null){System.out.println("Habitatge no trobat");}
                        else{System.out.println(h);}


                    case 3:
                        String propietari2 =vista.askString("Introdueix el nom del propietari a eliminar: ");
                        String adreca2=vista.askString("Introdueix la adreça a del habitatge a eliminar: ");
                        model.eliminarHabitatge(propietari2,adreca2);
                    case 4:
                        String tipus = vista.askString("Introdueix el tipus d'habitatge a buscar: ");
                        if(!tipus.equals("Pis")&&!tipus.equals("Casa")){
                            throw new Exception("Ha de ser pis o casa");

                        }

                }

            } catch (Exception e) {
                System.out.println("Error: "+ e);
            }

        }

    }

}
