package pertemuan2.arrayrecord;

import java.util.Scanner;

public class MainRecord {

	public static void main(String[] args) {
		/*
		 * Cara mengakses kelas record mirip dengan cara mkita menggunakan kelas Scanner
		 * 
		 * Scanner sc = new Scanner ()(System.in);
		 * [namaKelas] [alias] = new [namaKelas] ();
		 * 
		 */
		
		Motor moto = new Motor ();
		Scanner sc = new Scanner (System.in);
		String id, merk, jenis, cc;
		int harga;
		System.out.println("Masukan ID :"); id=sc.next();
		System.out.println("Masukan Merk :"); merk=sc.next();
		System.out.println("Masukan Jenis :"); jenis=sc.next();
		System.out.println("Masukan CC :"); cc=sc.next();
		System.out.println("Masukan Harga :"); harga=sc.nextInt();
		
		moto.inputNilai(id, merk, jenis, cc, harga);
		moto.tampilNilai();
	}
	
	
}
