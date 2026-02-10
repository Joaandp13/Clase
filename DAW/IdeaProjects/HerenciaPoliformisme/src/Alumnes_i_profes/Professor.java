package Alumnes_i_profes;

public class Professor extends Membre {
    private String departament;
    private Boolean funcionari;

    public Professor(String nom, String cognoms, Data dataNaixement, String departament, Boolean funcionari) {
        super(nom, cognoms, dataNaixement);
        validarDepartament(departament);
        this.departament = departament;
        this.funcionari = funcionari;


    }
    private void validarDepartament(String departament){
        if(!departament.equals("Informàtica")&& !departament.equals("Ciències") && !departament.equals("Lletres")){
            throw new IllegalArgumentException("Departament ha de ser Informàtica, Ciéncies o Lletres!");
        };
    }

    @Override
    public String toString() {
        return"PROFESSOR - "+
         super.toString()+
                " ,Departament: "+departament+
                " ,És funcionari?"+(funcionari?" És funcionari.":" No és funcionari.");
    }
}
