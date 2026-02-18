package Model;

public class Casa extends Habitatge{

    private boolean teJardi;

    private double preu;

    public Casa(String adreca,String propietari,double preu,boolean teJardi)throws Exception{
        super(adreca,propietari);
        if(preu<500000){throw new Exception("El preu d'una casa de luxe no pot ser inferior a 500.000€");}
        if(adreca.isBlank())throw new Exception("La adreça no pot estar buida");
        this.preu=preu;

    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPreufinal(){
        return (preu*1.10);
    }
    @Override
    public String toString(){
        return "Propietari: "+getPropietari()+
                "\nAdreça: "+ getAdreca()+
                "\nPreufinal: "+getPreufinal()+
                "\nComissió: "+(preu*0.19)+
                "\nJardí: "+(teJardi?"Sí":"No")+
                "\n";

    }
}
