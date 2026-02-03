package Genshin;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArtifactRecommended {
    String pieza;
    String majoraffix;
    ArrayList<String> minoraffix;
    public ArtifactRecommended(String pieza,String majoraffix, ArrayList<String> minoraffix){
        this.pieza = pieza;
        this.majoraffix = majoraffix;
        this.minoraffix = minoraffix;
    }
    @Override
    public String toString() {
        String result = pieza + "\n";
        result += "Main Stat: " + majoraffix + "\n";
        result += "Substats Priority:\n";


        for (String sub : minoraffix) {
            result += "  • " + sub + "\n";
        }

        return result;
    }
}
