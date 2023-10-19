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
      int temp=0;
      temp=basket[i-1];
      basket[i-1]=basket[j-1];
      basket[j-1]=temp;
    }
    
    for(int i:basket) {
      System.out.print(i+" ");
    }
  }
}
