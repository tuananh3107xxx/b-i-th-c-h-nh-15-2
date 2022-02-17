
import java.util.Scanner;
public class TinTong {
  public static void main(String[] args) {
    int number, sum = 0;
    Scanner scanner = new Scanner(System.in);      
    do {
     System.out.println("Nhập vào số nguyên bất kỳ: ");
       number = scanner.nextInt();
       sum += number;;
   } while (sum < 100); 
     System.out.println("tong vua nha = "+sum);
    }
 }
