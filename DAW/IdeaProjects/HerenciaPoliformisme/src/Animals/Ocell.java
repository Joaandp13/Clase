package Animals;

public class Ocell extends Animal{
    int tamanyales;
    public Ocell(String nom, int tamanyales){
        super(nom);
        this.tamanyales=tamanyales;
    }
    public int getTamanyales(){
        return tamanyales;
    }
}
