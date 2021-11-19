import java.util.Scanner;

//Write a complete program to find the length of maximum subsequence of '1'
// in the given string as '0' & '1'
//
//if there is no subsequence of '1' print '-1

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inputString = input.nextLine();
    String[] inputStringArray = inputString.split("0");
    if (inputStringArray.length == 0) {
      System.out.println(-1);
      System.exit(0);
    }
    int max = inputStringArray[0].length();
    for (int i = 0; i < inputStringArray.length; i++) {
      if (max < inputStringArray[i].length()) max =
        inputStringArray[i].length();
    }
    if (max > 0) {
      System.out.println(max);
    } else {
      System.out.println(-1);
    }
  }
}
