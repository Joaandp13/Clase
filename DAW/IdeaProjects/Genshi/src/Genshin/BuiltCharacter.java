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
        Character hutao = new Character(
                "HuTao","Pyro","Spear","DPS",5
        );
        Arma homaStaff = new Arma(
                "Staff of Homa",
                "Spear",
                "5★",
                46,
                "CRIT DMG%",
                14.4,
                """
                    • HP increased by 20%.
        
                    • Additionally, provides an ATK Bonus based on
                    0.8% of the wielder’s Max HP.
        
                    • When the wielder's HP is less than 50%,
                    this ATK Bonus is increased by an additional
                    1% of Max HP.
                """

        );
        Character columbina = new Character(
                "Columbina", "Hydro", "Catalyst", "Support/Sub-DPS", 5
        );

        Arma nocturnesCurtainCall = new Arma(
                "Nocturne's Curtain Call",
                "Catalyst",
                "5★",
                542,
                "CRIT DMG%",
                88.2,
                """
                • Max HP is increased by 10%~18%.
        
                • When triggering Lunar reactions or inflicting
                  Lunar Reaction DMG on opponents, the wielder
                  restores 14~18 Energy and gains the
                  Bountiful Sea’s Sacred Wine effect for 12s.
        
                • While the Sacred Wine effect is active:
                    – Max HP is increased by an additional 14%~22%.
                    – CRIT DMG from Lunar Reaction DMG is increased
                      by 60%~140%.
        
                • This effect can trigger once every 18s
                  and works even off-field.
                """
        );
        builds.add(new BuiltCharacter(alhaitham,foliarIncision));
        builds.add(new BuiltCharacter(columbina,nocturnesCurtainCall));
        builds.add(new BuiltCharacter(hutao,homaStaff));
    }

}






