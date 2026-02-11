package Transport;

public class Coche extends Terrestre{
    private int numPortes;
    private String tipusCoche;
    public Terrestre(String nom, int velocitatMaxima, int capacitat,int rodes,String combustible,int numPortes,String tipusCoche){
        super(nom,velocitatMaxima,capacitat,rodes,combustible);
        if(numPortes<1)throw new IllegalArgumentException("El número de portes no pot ser inferior a 1.");
        if(!tipusCoche.equals("Sedán") && !tipusCoche.equals("Hatchback") && !tipusCoche.equals("SUV") && !tipusCoche.equals("Todoterreno") && !tipusCoche.equals("Coupé") && !tipusCoche.equals("Convertible") && !tipusCoche.equals("Station Wagon") && !tipusCoche.equals("Pickup") && !tipusCoche.equals("Deportivo") && !tipusCoche.equals("Lujo") && !tipusCoche.equals("Ciudad") && !tipusCoche.equals("Eléctrico") && !tipusCoche.equals("Híbrido") && !tipusCoche.equals("FWD") && !tipusCoche.equals("RWD") && !tipusCoche.equals("AWD") && !tipusCoche.equals("4x4")throw new IllegalArgumentException("Tipus invàlid"));


    }



}
