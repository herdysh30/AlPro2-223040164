package pertemuan5.matrix;

import java.util.Scanner;

public class Challange2 {
public static int [][] matNilai = new int [5][5];
	public static void tampilNilai() {
		for(int baris = 0; baris < 5;baris++) {
			for(int kolom = 0; kolom <5; kolom++) {
				System.out.print(" | "+matNilai [baris][kolom]);
				
			}
			
			System.out.print(" | \n");
		}
	}
	
	public static void main(String[] args) {
		tampilNilai();
		
	}
}
