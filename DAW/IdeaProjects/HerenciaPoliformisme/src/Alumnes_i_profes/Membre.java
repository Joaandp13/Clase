package Alumnes_i_profes;

public class Membre {
    protected String usuari;
    protected String nom;
    protected String cognoms;
    protected Data dataNaixement;

    public Membre(String nom, String cognoms, Data dataNaixement){
        this.nom=nom;
        this.cognoms=cognoms;
        this.dataNaixement=dataNaixement;
        generarUsuari();
    }
    private void generarUsuari(){
        String primerCognom = cognoms.split(" ")[0];
        this.usuari=(""+nom.charAt(0)+primerCognom).toLowerCase();
    }
    public String getUsuari(){
        return usuari;
    }
    @Override
    public String toString(){
        return "Usuari: " + usuari +
                ", Nom: " + nom +
                ", Cognoms: " + cognoms +
                ", Data naixement: " + dataNaixement;
    }
}
