import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    final double PI = 3.14;
    double area = PI * radius * radius;
    System.out.printf("%2f", area);
  }
}
