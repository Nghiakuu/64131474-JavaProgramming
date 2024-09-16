package BT2;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		int a,b,tong;
		Scanner banPhimScanner = new Scanner(System.in);
		System.out.println("---CT Tính tông 2 số nguyên---");
		System.out.print("a = ");
		a=banPhimScanner.nextInt();
		System.out.print("b = ");
		b=banPhimScanner.nextInt();
		tong = a + b;
        System.out.print("Tong = " + tong);
	}

}