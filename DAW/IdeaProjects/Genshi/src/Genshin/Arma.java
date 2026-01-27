package Genshin;

public class Arma {
    String name;
    String type;
    String rarity;
    int baseATK;
    String secondaryStat;
    double secondaryStatValue;
    String passiveEffect;



    public Arma(String name, String type, String rarity, int baseATK, String secondaryStat, double secondaryStatValue, String passiveEffect) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.baseATK = baseATK;
        this.secondaryStat = secondaryStat;
        this.secondaryStatValue = secondaryStatValue;
        this.passiveEffect = passiveEffect;
    }

    @Override
    public String toString() {
        return "Arma{" + '\n' +
                "   Nom=" + name + '\n' +
                "   Tipus=" + type + '\n' +
                "   Raresa=" + rarity + '\n' +
                "   ATK Base=" + baseATK + '\n' +
                "   Stat Secundari=" + secondaryStat + secondaryStatValue + '\n' +
                "   Efecte Passiu=\n" + passiveEffect + '\n' +
                '}';
    }
}
