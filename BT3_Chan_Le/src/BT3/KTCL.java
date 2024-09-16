package BT3;

import java.util.Scanner;

public class KTCL {

	public static void main(String[] args) {
		
		 int a;
			Scanner banphim = new Scanner(System.in);
			System.out.print("Nhập số nguyên a: ");
			a=banphim.nextInt();
			if(a % 2 == 0) {
				System.out.print("a la so chan");
			}
			else System.out.print("a la so le");
	}

}