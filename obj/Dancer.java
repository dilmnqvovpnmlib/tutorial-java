public class Dancer extends Character {

    public void attack(Matango matango) {
        matango.hp -= 3;
        System.out.println(this.name + "は、ダメージを与えた。");
    };

    public void dance() {
        System.out.println(this.name + "は、踊った。");
    }
}