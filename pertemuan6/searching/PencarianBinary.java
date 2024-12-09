package pertemuan6.searching;

import java.util.Scanner;

public class PencarianBinary {
	
	/*
	 * Pencarian binary adalah pencarian layaknya pada kamus, sehingga sudah terurut 
	 * seperti index
	 */
	
	static int [] arrNilai = new int [100];
	
	static void binarySearch () {
		Scanner sc = new Scanner (System.in);
		int cari, elTengah;
		int elAwal = 0;
		int elAkhir = arrNilai.length-1;
		System.out.println("Masukan nilai yang anda cari : ");
		cari = sc.nextInt();
		String status = "Data tidak ditemukan";
		//proses melihat
		while (elAwal <= elAkhir) {
			elTengah = (elAwal + elAkhir)/2;
			//proses membandingkan
			if(cari == arrNilai[elTengah]) {
				//memutuskan
				status = "Data Ditemukan";
				break;
			} else if(cari < arrNilai[elTengah]) {
				elAkhir = elTengah-1;
			} else if(cari > arrNilai[elTengah]) {
				elAwal = elTengah+1;
			}
		}
		System.out.println(status);
	}
	
	public static void main(String[] args) {
		binarySearch();
	}

}
