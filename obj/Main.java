public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Hero hero = new Hero("きわた");
        // hero.name = "Kiwata";
        // hero.hp = 200;
        System.out.println(hero.name + "hp" + hero.hp);

        SuperHero superHero = new SuperHero();
        superHero.flying = true;
        System.out.println(superHero.name);

        Sword sword = new Sword();
        sword.name = "炎の剣";
        sword.damage = 100;
        hero.sword = sword;

        // method呼び出し
        hero.sit(8);
        System.out.println(hero.sword.name);
        hero.run();

        Wizard wizard = new Wizard();
        wizard.heal(hero);

        Matango matago = new Matango();
        superHero.attack(matago);
        matago.run();
    }
}