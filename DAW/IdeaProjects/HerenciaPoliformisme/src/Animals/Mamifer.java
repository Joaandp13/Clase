package Animals;

public class Mamifer extends Animal{
    boolean Pelo;
    public Mamifer(String nom,Boolean Pelo){
        super(nom);
        this.Pelo=Pelo;
    }
    public boolean getPelo(){
        return Pelo;
    }
}
