import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] basket = new int[n];
    
    for (int i = 0; i < basket.length; i++) {
      basket[i]=i+1;
    }
    
    
    for (int k = 0; k < m; k++) {
      int i=sc.nextInt();
      int j=sc.nextInt();
      List<Integer> temp = new ArrayList<Integer>();
      
      for (int l = i-1; l < j; l++) {
        temp.add(basket[l]);
      }
      Collections.reverse(temp);
      
      
      int cnt=0;
      for (int l = i-1; l < j; l++) {
        basket[l]=temp.get(cnt);
        cnt++;
      }
   
    }
    for(int i:basket) {
      System.out.print(i+" ");
    }
    
  }
}