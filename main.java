import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] card = { "2d", "2k", "2h", "2s", "3d", "3k", "3h", "3s", "4d", "4k", "4h", "4s", "5d", "5k", "5h", "5s",
        "6d", "6k", "6h", "6s", "7d", "7k", "7h", "7s", "8d", "8k", "8h", "8s", "9d", "9k", "9h", "9s", "10d", "10k",
        "10h", "10s", "jd", "jk", "jh", "js", "qd", "qk", "qh", "qs", "kd", "kk", "kh", "ks", "ad", "ak", "ah", "as", };
    Scanner scan = new Scanner(System.in);
    int jL = scan.nextInt();
    for (int i = 0; i <= jL; i++) {
      Random r = new Random();
      int acak = r.nextInt(41);
      System.out.print(card[acak] + " ");
    }

  }

}
