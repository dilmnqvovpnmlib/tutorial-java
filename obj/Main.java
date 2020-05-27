public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Hero hero = new Hero("kiwata");
        Hero kiwata = new Hero("kiwata");
        System.out.println(hero.equals(kiwata));
        System.out.println("Hellooooo");
        System.out.println(hero.getName());
        // hero.hp = 10000;
        // hero.name = "Kiwata";
        // hero.hp = 200;
        // getter経由で呼びだす必要がある
        // System.out.println(hero.name + "hp" + hero.hp);

        // SuperHero superHero = new SuperHero();
        // superHero.flying = true;
        // System.out.println(superHero.getName());

        // Sword sword = new Sword();
        // sword.name = "炎の剣";
        // sword.damage = 100;
        // hero.sword = sword;

        // // method呼び出し
        // hero.sit(8);
        // System.out.println(hero.sword.name);
        // hero.run();

        // Wizard wizard = new Wizard();
        // wizard.heal(hero);

        // Matango matago = new Matango();
        // superHero.attack(matago);
        // matago.run();

        // System.out.println("---------");

        // Weapon weapon = new Weapon();
        // System.out.println(weapon.name);

        // Dancer dancer = new Dancer();
        // dancer.name = "Nakaoka";
        // System.out.println(dancer.name);
    }
}