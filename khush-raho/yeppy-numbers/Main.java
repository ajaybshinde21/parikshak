import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //		It is a single line input of two positive integers separated by a space.
    int iterations = 1;
    Scanner sc = new Scanner(System.in);
    int lowerLimit = sc.nextInt();
    int upperLimit = sc.nextInt();
    for (; lowerLimit <= upperLimit; lowerLimit++) {
      int num = lowerLimit;
      int sum = 0;
      while (sum != 1) {
        iterations += 1;
        if (iterations == 11) {
          break;
        }

        while (num != 0) {
          sum = sum + (num % 10) * (num % 10);
          num = num / 10;
        }

        if (sum == 1) {
          System.out.println(lowerLimit + " " + iterations);
          break;
        }
        num = sum;
        sum = 0;
      }
      iterations = 1;
    }
  }
}
