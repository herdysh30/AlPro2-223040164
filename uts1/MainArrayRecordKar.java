package uts1;

import java.util.Scanner;

public class MainArrayRecordKar {
	
	static Karyawan [] arrKar = new Karyawan [2];
	
	public static void inputNilai() {
		Scanner sc = new Scanner (System.in);
		String id, nama, jenis;
		int harga;
		
		for (int idx=0; idx < arrKar.length; idx++) {
			System.out.println("Masukan Barang ke-"+idx);
			arrKar [idx] = new Karyawan();
			//inisalisasi setiap mengakses elemen array
			
			System.out.print("Masukan ID :"); id=sc.next();
			System.out.print("Masukan Nama :"); nama=sc.next();
			System.out.print("Masukan Jenis :"); jenis=sc.next();
			System.out.print("Masukan Harga :"); harga=sc.nextInt();
			
			arrKar[idx].inputNilai(id, nama, jenis, harga);
		}
	}
	public static void tampilNilai () {
		for (int idx=0; idx < arrKar.length; idx++) {
			System.out.println("Data Barang ke-"+idx);
			arrKar[idx].tampilNilai();
		}
	}
	public static void main(String[] args) {
		inputNilai();
		tampilNilai();
		
	}

}
