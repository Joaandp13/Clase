package Alumnes_i_profes;

public class Alumne extends Membre {
    private String cicle;
    private int curs;
    public Alumne(String nom, String cognoms, Data dataNaixement, String cicle, int curs){
        super(nom,cognoms,dataNaixement);
        validarCicle(cicle);
        validarCurs(curs);

        this.cicle=cicle;
        this.curs=curs;
    }

    private void validarCicle(String cicle) {
        if (!cicle.equals("ESO") &&
                !cicle.equals("BTX") &&
                !cicle.equals("SMX") &&
                !cicle.equals("ASIX") &&
                !cicle.equals("DAW")) {

            throw new IllegalArgumentException("Cicle incorrecte");
        }
    }
    private void validarCurs(int curs){
        if (curs!=1&&curs!=2){
            throw new IllegalArgumentException("Curs ha de ser 1 o 2");
        }
    }
    @Override
    public String toString(){
        return "ALUMNE - "+ super.toString() +
                ", Cicle: "+ cicle+
                ", Curs: "+ curs;
    }

}
