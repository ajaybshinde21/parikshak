import java.util.Scanner;

public class MeraNaamJoker {
  public static void main(String[] args) {
    String[] fullNameStringArray = getFullName();
    int lengthOfFullNameStringArray = fullNameStringArray.length;
    if(lengthOfFullNameStringArray == 3){
      System.out.println(fullNameStringArray[2] + " " + fullNameStringArray[0] + " " + fullNameStringArray[1]);
    }else if(lengthOfFullNameStringArray == 2){
      char lastChar = fullNameStringArray[1].charAt(fullNameStringArray[1].length()-1);
      String lastCharInString = lastChar+"";
      if( lastCharInString.matches("[aeiouAEIOU]")){
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
}
