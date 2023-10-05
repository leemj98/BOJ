import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] basket = new int[n];

      for (int i = 0; i < basket.length; i++) {
        basket[i] = 0;
      }
      
      for (int l = 0; l < m; l++) {
        int i,j,k;
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        
        for (int num = i-1; num< j; num++) {
          basket[num] = k; 
        }
      }
      

      for (int i : basket) {
        System.out.print(i+" ");
      }
      
      
    }   
    
}