public class SuperHero extends Hero {
    boolean flying;

    @Override
    public void run() {
        System.out.println(String.format("%sは、撤退した！", this.getName()));
    }

    @Override
    public void attack(Matango matango) {
        super.attack(matango);
        if (this.flying) {
            super.attack(matango);
            System.out.println(String.format("スーパーヒーロー %sは二倍のダメージを与えた！", super.getName()));
        }
    }

    public void fly() {
        this.flying = true;
        System.out.println("飛んだ！");
    }
}