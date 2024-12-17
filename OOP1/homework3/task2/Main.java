package bg.tu_varna.sit.b2.f23621689.homework3.task2;

public class Main {
    public static void main(String[] args) {
        Defender defender = new Defender("Защитник Иван", 80, 50, 30);

        System.out.println("Име на защитника: " + defender.getName());
        System.out.println("Живот на защитника: " + defender.getLife());
        System.out.println("Защитно умение: " + defender.getDefensiveSkill());
        System.out.println("Броня: " + defender.getArmor());
        System.out.println("Лечителско умение: " + defender.getHealingSkill());

        Attacker attacker = new Attacker("Атакуващ Петър", 90);

        System.out.println("\nИме на атакуващия: " + attacker.getName());
        System.out.println("Живот на атакуващия: " + attacker.getLife());
        System.out.println("Ефективност: " + attacker.getEfficiency());

        defender.setArmor(60);
        attacker.setEfficiency(95);

        System.out.println("\nНова броня на защитника: " + defender.getArmor());
        System.out.println("Нова ефективност на атакуващия: " + attacker.getEfficiency());
    }
}
