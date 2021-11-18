//Perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
//
//Write a program to check if a given number is a perfect number.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int num = getNumberInput();
    int[] properFactors = findProperFactors(num);
    int sumOfFactors = getSumOfFactors(properFactors);
    boolean isNumPerfectNumber = (num == sumOfFactors) ? true : false;
    if (isNumPerfectNumber) System.out.println(num); else System.out.println(
      -1
    );
  }

  private static int getNumberInput() {
    Scanner input = new Scanner(System.in);
    return input.nextInt();
  }

  private static int getSumOfFactors(int[] properFactors) {
    int sum = 0;
    int lenOfProperFactorsArray = properFactors.length;
    for (int i = 0; i < lenOfProperFactorsArray; i++) {
      sum += properFactors[i];
    }
    return sum;
  }

  public static int[] findProperFactors(int num) {
    ArrayList<Integer> factorsList = new ArrayList<>();

    int num_copy = num;
    for (; num_copy > 0; num_copy--) {
      if (num % num_copy == 0) {
        factorsList.add(num / num_copy);
      }
    }

    int[] properFactors = new int[factorsList.size()];
    for (int i = 0; i < factorsList.size() - 1; i++) {
      properFactors[i] = factorsList.get(i);
    }
    return properFactors;
  }
}
