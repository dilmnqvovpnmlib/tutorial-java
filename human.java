public class human {
  // private String name = "Kiwata";
  public static void main(String[] args) {
    String name = "Hayato";
    int[] data;
    data = new int[5];
    data[0] = 100;
    int[] scores = { 1000, 10, 20, 30, 40, 50 };
    int ans = 0;
    for (int i : scores) {
      ans += i;
    }
    int[][] test = { { 4, 5, 6 }, { 1, 2, 3 } };
    // float a = 3.14;
    // int b = (int)a; b = 3
    hello(name = "kiwata");
    System.out.println(cal(scores));
    java.util.Arrays.sort(scores);
    System.out.println(scores[0]);

    System.out.println(test[0][0]);
  }

  public static void hello(String name) {
    System.out.println("Hello" + name);
  }

  public static int cal(int[] array) {
    int ans = 0;
    for (int value : array) {
      ans += value;
    }
    return ans;
  }
}