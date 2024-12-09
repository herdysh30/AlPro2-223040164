package pertemuan1.array;

import java.util.Scanner;

public class LatihanArray2dinamis {
	/*
	 * Kita akan membuat program menggunakan array dengan tipedata double,
	 * dimana index array akan diinputkan melalui input keyboard 
	 */
	
	//scanner akan digunakan di banyak tempat
	public static Scanner sc = new Scanner (System.in);
	public static double [] arrNilai;
	
	//prosedur inisialisasi array
	public static void initArray () {
		System.out.println("Masukan jumlah index array : ");
		int idx = sc.nextInt();
		arrNilai = new double [idx];
	}
	
	public static void inputNilai () {
		for (int a=0 ; a<arrNilai.length ;a++) {
			System.out.println("Masukan nilai ke-"+a);
			arrNilai[a] = sc.nextDouble();
		}
	}
	
	public static void tampilNilai () {
		for (int a=0;a<arrNilai.length;a++) {
			System.out.println(arrNilai[a]);
			
		}
	}
	
	public static void main(String[] args) {
		initArray();
		inputNilai();
		tampilNilai();
	}

}
