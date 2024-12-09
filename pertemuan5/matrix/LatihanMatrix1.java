package pertemuan5.matrix;

import java.util.Scanner;

public class LatihanMatrix1 {
	/*
	 * Matrix adalah array multidimensi, dimana akan mengelola nilai dengan dua index 
	 * yaitu index baris dan kolom.
	 * Format deklarasinya adalah
	 * Tipedata [][] aliasMatrix = new Tipedata [baris][kolom];
	 * 
	 * COntoh soal :
	 * Buatlah program matrix nilai dengan index 5x5, dimana input nilai dan tampil nilai
	 * dibuat dengan method.
	 * input nilai dilakukan dengan input keyboard
	 */
	
	public static int [][] matNilai = new int [5][5];
	
	public static void inputNilai (){
		Scanner sc = new Scanner (System.in);
		/* Karena matrix itu multidimensi, maka loop untuk aksesnya harus menggunakan 
		 *nested loop (Loop dalam loop), karena akan ada loop untuk
		 *baris dan loop untuk kolom 
		 *
		 */
		for(int baris = 0; baris < 5;baris++) {
			for(int kolom = 0; kolom <5; kolom++) {
				System.out.println("Masukan Nilai "+baris+", "+kolom);
				matNilai [baris][kolom] = sc.nextInt();
			}
		}
	}
	
	public static void tampilNilai() {
		for(int baris = 0; baris < 5;baris++) {
			for(int kolom = 0; kolom <5; kolom++) {
				if (baris == 2 || kolom == 2) {
					System.out.print("x");
				}
				else {
					System.out.print("1");
				}
			}
			
			System.out.println(" | \n");
		}
	}
	
	public static void main(String[] args) {
		inputNilai();
		tampilNilai();
		
	}

}
