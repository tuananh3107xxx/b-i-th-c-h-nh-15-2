
import java.util.Scanner;
public  class TimSoNhoNha {
    
     public static void main(String[] args) {
        int SoDau, SoHai;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Nh so thu 1:");
        SoDau = scanner.nextInt();
        System.out.println ("Nh so thu 2: ");
        SoHai = scanner.nextInt();
int SoMin = SoDau;
if (SoDau > SoHai)
SoMin = SoHai;
System.out.println("so nho  la:" + SoDau  + SoHai);
    }
}
