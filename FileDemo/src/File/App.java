package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
		fout =new FileOutputStream("num.clc");
		} catch (FileNotFoundException e) {
			System.out.println("File khong ton tai!");
		}

		try {
			for(int i=1;i<=127;i++) {
				fout.write(1);
				fout.close();
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.print("Done");
	}

}
