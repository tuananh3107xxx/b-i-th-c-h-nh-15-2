import java.util.Scanner;
public class bai1522022 {
public static void main(String[]  args) {
	int n, SoDu, tong = 0;
	Scanner scanner = new Scanner (System.in);
	System.out.println (" nha so nguyen n :");
	n = scanner.nextInt();
	while (n > 0) {
		SoDu = n % 10;
		n = n/ 10;
		tong += SoDu;
		
	}
System.out.println ("Tong cac chu so cua n la = " + tong);
}
}