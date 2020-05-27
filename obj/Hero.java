public class Hero {
    String name = "";
    int hp;
    Sword sword;

    public Hero(String string) {
        this.name = string;
        this.hp = 100;
    }

    public Hero() {
        this("テスト");
    }

    public void attack(Matango matango) {
        System.out.println(this.name + "の攻撃");
        matango.hp -= 5;
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した。");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座って、体力を回復した。");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、コケた。");
    }

    public void run() {
        System.out.println("GAMEOVER" + this.hp);
    }
}