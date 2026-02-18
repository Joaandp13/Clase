package Model;

public class Pis extends Habitatge{
    private boolean teAscensor;
    private double preu;
    private int planta;
    public Pis(String adreca,String propietari,double preu,boolean teAscensor,int planta)throws Exception{
        super(adreca,propietari);

        if(planta>1&&teAscensor){throw new Exception("El preu d'una casa de luxe no pot ser inferior a 500.000€");}
        if(adreca.isBlank())throw new Exception("La adreça no pot estar buida");
        this.preu=preu;

    }

    public boolean isTeAscensor() {
        return teAscensor;
    }

    public void setTeAscensor(boolean teAscensor) {
        this.teAscensor = teAscensor;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public double getPreufinal(){
        return (preu*1.10);
    }

    @Override
    public String toString(){
        return "Propietari: "+getPropietari()+
                "\nAdreça: "+ getAdreca()+
                "\nPlanta: "+ planta+
                "\nPreufinal: "+getPreufinal()+
                "\nComissió: "+(preu*0.19)+
                "\nAscensor: "+(teAscensor?"Sí":"No")+
                "\n";
    }
}
