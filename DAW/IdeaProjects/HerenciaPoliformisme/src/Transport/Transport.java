package Transport;

public class Transport {
    private String nom;
    protected int velocitatMax;
    protected int capacitat;
    public Transport(String nom, int velocitatMax, int capacitat)throws IllegalArgumentException{
        if(velocitatMax<=0)throw new IllegalArgumentException("La velocitat no pot ser negativa o 0!");
        if(capacitat<1)throw new IllegalArgumentException("La capacitat no pot ser menor a 1");
        this.nom=nom;
        this.velocitatMax=velocitatMax;
        this.capacitat=capacitat;
    }
    public String getNom(){
        return nom;
    }
    public int getVelocitatMax(){
        return velocitatMax;
    }
    public int getCapacitat(){
        return capacitat;
    }
    @Override
    public String toString(){
        return "Nom: "+nom+
                " ,Velocitat Màxima: "+velocitatMax+" " +
                ",Capacitat: "+capacitat;


    }
}
