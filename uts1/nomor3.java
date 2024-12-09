package uts1;

import java.util.Scanner;

public class nomor3 {

	
	static String [] mahasiswa = new String[10];
	static Scanner sc = new Scanner (System.in);
	
	public static void inputMahasiswa() {
		for (int i=0; i< mahasiswa.length; i++) {
			System.out.println("masukan nama index ke-"+i+"' : ");
			mahasiswa[i]=sc.next();
		}
		
	}
	
	public static void tampilDataMahasiswa() {
		for (int i=0; i< mahasiswa.length;i++) {
			System.out.println("nama mahasiswa index ke-"+i+" : "+mahasiswa[i]);
		}
		
	}
	
	public static void pencarianMahasiswa() {
		System.out.println("masukan nama yang dicari : ");
		String cari=sc.next();
		String pesan = "Tidak ditemukan";
		for (int i=0; i<mahasiswa.length;i++) {
			if (mahasiswa[i].equalsIgnoreCase(cari)) {
				pesan = "Nama mahasiswa ditemukan di index ke-"+i;
			} 
		}
		System.out.println(pesan);
	}
	
	public static void main(String[] args) {
		inputMahasiswa();
		tampilDataMahasiswa();
		pencarianMahasiswa();
		
	}

}
