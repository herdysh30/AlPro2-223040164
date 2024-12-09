package pertemuan6.searching;

import java.util.Scanner;

public class PencarianSekuensial1 {
	
	
	/*
	 * Pencarian sekuensial adalah pencarian terurut, dimana kita akan membandingkan
	 * nilai dari satu elemen ke elemen berikutnya hingga ditemukan.
	 * Syarat dari sekuensial array harus sudah terurut
	 */
	
	static int [] arrNilai = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void cariNilai () {
		Scanner sc = new Scanner(System.in);
		int cari;
		String pesan = "Tidak ditemukan";
		System.out.print("Masukan nilai yang anda cari :");
		cari = sc.nextInt();
		
		//Proses melihat (mengakses elemen satu persatu)
		for (int idx=0;idx<arrNilai.length;idx++) {
			//proses membandingkan (Nilai elemen dengan nilai cari)
			if(arrNilai[idx] == cari) {
				//proses memutuskan
				pesan = "Ditemukan";
				break;
			}
			
		}
		System.out.println(pesan);
	}
	
	
	public static void main(String[] args) {
		cariNilai();
	}

}
