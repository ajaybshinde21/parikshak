import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arraySize = input.nextInt();
    input.nextLine();
    String s = input.nextLine();
    String[] s_arr = s.split(" ");
    int sum = 0;
    for (int i = 0; i < arraySize; i++) {
      sum += Integer.parseInt(s_arr[i]);
    }
    System.out.println(sum);
    System.out.println(sum / arraySize);
  }
}
