package Model;



public abstract class Habitatge {
    private String propietari;
    private String adreca;

    public Habitatge(String propietari,String adreca)throws Exception {
        if(adreca.isBlank())throw new Exception("La adreça no pot estar buida.");
        if(propietari.isBlank())throw new Exception("L'habitatge ha de tenir un propietari");
        this.propietari=propietari;
        this.adreca=adreca;

    }

    public String getPropietari() {
        return propietari;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
}
