import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static final void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean isPanagram = checkForPanagram(sc.nextLine());
    if (isPanagram) System.out.println("Fully Loaded"); else System.out.println(
      "No"
    );
  }

  public static boolean checkForPanagram(String s) {
    s = s.replaceAll(" ", "");
    s = s.replaceAll("[0-9]", "");
    s = s.toLowerCase();
    System.out.println(s);
    Map<String, Integer> alphabets = new TreeMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (String.valueOf(s.charAt(i)).matches("[a-z]")) {
        alphabets.put(String.valueOf(s.charAt(i)), i);
      }
    }

    if (alphabets.size() == 26) {
      return true;
    }
    return false;
  }
}
