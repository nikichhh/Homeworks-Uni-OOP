package bg.tu_varna.sit.b2.f23621689.homework3.task2;

public class Defender extends Character{
    private int defensiveSkill;
    private int armor;
    private int healingSkill;

    public Defender(String name, int defensiveSkill, int armor, int healingSkill) {
        super(name, 250);
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }

    public int getDefensiveSkill() {
        return defensiveSkill;
    }

    public void setDefensiveSkill(int defensiveSkill) {
        this.defensiveSkill = defensiveSkill;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealingSkill() {
        return healingSkill;
    }

    public void setHealingSkill(int healingSkill) {
        this.healingSkill = healingSkill;
    }
}
