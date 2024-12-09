package pertemuan1.array;

import java.util.Scanner;

public class LatihanArray1 {
	/*
	 * Kita akan buat program array untuk menampung nama mahasiswa,
	 * yang terdiri dari 5 nama mahasiswa
	 *
	 * 
	 * Array adalah struktur data sederhana untuk nilai-nilai
	 * dengan tipedata yang sama.
	 * Dimana isi atau elemen di dalamnya akan berurutan dimulai dari elemen ke-0 
	 * sampai ke maks-1
	 * 
	 * Format deklarasi Array :
	 * <tipedata> [] <namaArray. = new <tipedata>[indeksMaks];
	 * 
	 */
	
	//deklarasi arrayNama sebagai variable global
	public static String []arrNama = new String [5];
	//indexnya 0-4 nama mahasiswa
	
	/*
	 * Untuk menginputkan nilai ke dalam array formatnya:
	 * <namaArray> [indexYangAkanDiisi] = <isikanNilainya>
	 * contoh :
	 * arrNama [0] = "Michael";
	 * arrNama [10] = "Sizuka";
	 */
	//prosuder input nilai menggunakan keyboard
	public static void inputNilai () {
		Scanner sc = new Scanner (System.in);
		for(int idx=0; idx < arrNama.length ; idx++) {
			//.lenght akan berisi index maks array
			System.out.println("Masukan nama ke-" + idx);
			arrNama[idx] = sc.nextLine();
		}
	}
	
	public static void tampilNilai() {
		for(int idx=0; idx < arrNama.length ; idx++) {
			System.out.println(arrNama[idx]);
		}
	}
	
	public static void main(String[] args) {
		inputNilai();
		tampilNilai();
	}
}
