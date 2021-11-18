//Write a complete program to find the length of  minimum subsequence of '1' in the given string of '0's & '1's
//
//For Example:
//
//If the given string is '01111001110111011110001110111111
//
//Minimum subsequence of  '1' in the given string is '111' and the length is '3'. Similarly minimum subsequence of  '1' in the given string is '11101' and the length is '1'.
//
//Note: if there is no subsequence of '1' print '-1'.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inputStr = input.nextLine();
    String[] inputStrSplitArray = inputStr.split("0");
    if (inputStrSplitArray.length == 0) {
      System.out.println(-1);
      System.exit(0);
    }
    for (int i = 0; i < inputStrSplitArray.length; i++) {
      if (inputStrSplitArray[i].equals("")) {
        inputStrSplitArray[i] += Integer.MAX_VALUE;
      }
    }
    // remove "" from array
    int min = inputStrSplitArray[0].length();

    // store the count of min 1's
    for (int i = 0; i < inputStrSplitArray.length; i++) {
      if (inputStrSplitArray[i].equals("")) {
        continue;
      }
      if (inputStrSplitArray[i].length() < min) {
        min = inputStrSplitArray[i].length();
      }
    }

    if (min > 0) {
      System.out.println(min);
    } else {
      System.out.println(-1);
    }
  }
}
