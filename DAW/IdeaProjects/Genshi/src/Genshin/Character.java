package Genshin;

public class Character {
    String name;
    String element;
    String weaponType;
    String recommendedRole;
    int rarity;

    public Character(String name, String element, String weaponType, String recommendedRole,int rarity) {
        this.name = name;
        this.element = element;
        this.weaponType = weaponType;
        this.recommendedRole = recommendedRole;
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "Character{" + '\n' +
                "   Nom=" + name + '\n' +
                "   Rol Recomanat=" + recommendedRole + '\n' +
                "   Element=" + element + '\n' +
                "   Tipus Arma=" + weaponType + '\n' +
                "   Raresa=" + rarity +"⭐"+
                '}';
    }
}
