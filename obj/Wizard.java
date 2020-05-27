public class Wizard {
    String name;
    int hp;

    public void heal(Hero hero) {
        hero.setHp(10);
        System.out.println(String.format("%sは、体力を%d回復した。", hero.getName(), 10));
    }
}