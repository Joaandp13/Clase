package Transport;

public class Terrestre extends Transport{
    private int rodes;
    private String combustible;
    public Terrestre(String nom, int velocitatMaxima, int capacitat,int rodes,String combustible){
            super(nom, velocitatMaxima, capacitat);
            if(rodes<1)throw new IllegalArgumentException("El número de rodes no pot ser menor a 1");
            if(!combustible.equals("Gasolina")&&!combustible.equals("Diesel")&&!combustible.equals("Electric"))throw new IllegalArgumentException("Ha de ser:Gasolina,Diesel o Eléctric");
            this.rodes=rodes;
            this.combustible=combustible;
    }
    public int getRodes(){
        return rodes;
    }
    public String getCombustible(){
        return combustible;
    }

    @Override
    public String toString(){
        return
                "Tipus: Terrestre"+
                        " ,"+super.toString()+
                        " ,Número de Rodes: "+rodes+
                        " ,Tipus de Combustible: "+combustible;
    }
}
