package Transport;

public class Coche extends Terrestre{
    private int numPortes;
    private String tipusCoche;
    public Coche(String nom, int velocitatMaxima, int capacitat,int rodes,String combustible,int numPortes,TipusCoche tipusCoche){
        super(nom,velocitatMaxima,capacitat,rodes,combustible);
        if(numPortes<1)throw new IllegalArgumentException("El número de portes no pot ser inferior a 1.");
        if(tipusCoche==null){throw new IllegalArgumentException("No pot ser null!");}


    }



}
