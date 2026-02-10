package Transport;

public class Transport {
    private String nom;
    private int velocitatMax;
    private int capacitat;
    public Transport(String nom, int velocitatMax, int capacitat)throws Exception{
        if(velocitatMax<=0)throw new Exception("La velocitat no pot ser negativa o 0!");
        if(capacitat<1)throw new Exception("La capacitat no pot ser menor a 1!");
        this.nom=nom;
        this.velocitatMax=velocitatMax;
        this.capacitat=capacitat;
    }
}
