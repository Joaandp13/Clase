package Genshin;
import java.util.ArrayList;

public class BuiltCharacter {
    Character character;
    Arma weapon;

    public static ArrayList<BuiltCharacter> builds =new ArrayList<>();

    public BuiltCharacter(Character character, Arma weapon) {
        this.character = character;
        this.weapon = weapon;
    }

    public Character getCharacter(){
        return character;

    }

    public Arma getWeapon(){
        return weapon;
    }

    public static void loadBuilds() {
        Character alhaitham = new Character(
                "Alhaitham", "Dendro","Sword","DPS",5
        );

        Arma foliarIncision = new Arma(
                "Light of Foliar Incision",
                "Sword",
                "5★",
                44,
                "Crit DMG%",
                19.2,
                """
                        • CRIT Rate is increased by 4%.
        
                        • After Normal Attacks deal Elemental DMG,
                        the Foliar Incision effect will be obtained,
                        increasing DMG dealt by Normal Attacks and
                        Elemental Skills by 120% of Elemental Mastery.
        
                        • This effect will disappear after 28 DMG
                        instances or 12s.
        
                            • You can obtain Foliar Incision once every 12s.
                """
        );
        builds.add(new BuiltCharacter(alhaitham,foliarIncision));
    }

}






