import java.util.Scanner;

public class MeraNaamJoker {
	static boolean isSurName = false;
  public static void main(String[] args) {
    String[] fullNameStringArray = getFullName();
    int lengthOfFullNameStringArray = fullNameStringArray.length;
    if(lengthOfFullNameStringArray == 3){
      System.out.println(fullNameStringArray[2] + " " + fullNameStringArray[0] + " " + fullNameStringArray[1]);
    }else if(lengthOfFullNameStringArray == 2){
      if(isSurName){
        System.out.println(fullNameStringArray[1] +" " +fullNameStringArray[0]);
      }else{
        System.out.println(fullNameStringArray[0] + " " + fullNameStringArray[1]);
      }
    }else{
      System.out.println(fullNameStringArray[0]);
    }
  }

  private static String[] getFullName() {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String fullName = "";
    isSurName = checkIsSurName(s);
    final int MAXCHARCOUNT = 50;
    int charCountInString = 0;
    for(int i = 0; i < s.length() ;i++){
      if(s.charAt(i) == ' '){
        fullName+=s.charAt(i);
        continue;
      }
      if(charCountInString == 50){
        break;
      }
      charCountInString+=1;
      fullName+=s.charAt(i);
    }
    return fullName.split(" ");
  }
  private static boolean checkIsSurName(String s) {
    String[] tmpStringArray = s.split(" ");
    if(tmpStringArray.length == 2){
      if(tmpStringArray[1].matches(".*[aeiouAEIOU]$")){
        return true;
      }
    }
    return false;
  }
}
