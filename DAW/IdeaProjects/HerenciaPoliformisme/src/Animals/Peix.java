package Animals;

public class Peix extends Animal{
    int profunditat;
    public Peix(String nom,int profunditat){
        super(nom);
        this.profunditat = profunditat;
    }
    public int getProfunditat(){
        return profunditat;
    }
}
