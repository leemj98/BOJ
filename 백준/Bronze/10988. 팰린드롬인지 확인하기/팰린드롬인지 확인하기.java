import java.util.Scanner;

public class Main {
  
  public static boolean palindrome(String n) {
    char[] c = n.toCharArray();
    for (int i = 0; i < c.length; i++) {
      char nn = n.charAt((c.length-1)-i);
      if (c[i] != nn) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    
    if (palindrome(A)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
    
  }
  
}