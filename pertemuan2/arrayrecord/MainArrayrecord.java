package pertemuan2.arrayrecord;

import java.util.Scanner;

public class MainArrayrecord {
	/*
	 * Buatlah program terkait array of record dari kelas motor,
	 * dimana julah motor yang dikelola sebanyak 5 motor
	 * buatlah prosedur untuk menginputkan nilai ke dalam rray dan prosedur untuk menampilkan nilai
	 * dari array tersebut
	 */
	
	static Motor [] arrMotor = new Motor [5];
	
	public static void inputNilai() {
		Scanner sc = new Scanner (System.in);
		String id, merk, jenis, cc;
		int harga;
		
		for (int idx=0; idx < arrMotor.length; idx++) {
			System.out.println("Masukan data motor ke-"+idx);
			arrMotor [idx] = new Motor();
			//inisalisasi setiap mengakses elemen array
			
			System.out.println("Masukan ID :"); id=sc.next();
			System.out.println("Masukan Merk :"); merk=sc.next();
			System.out.println("Masukan Jenis :"); jenis=sc.next();
			System.out.println("Masukan CC :"); cc=sc.next();
			System.out.println("Masukan Harga :"); harga=sc.nextInt();
			
			arrMotor[idx].inputNilai(id, merk, jenis, cc, harga);
		}
	}
	public static void tampilNilai () {
		for (int idx=0; idx < arrMotor.length; idx++) {
			System.out.println("Data Motor ke-"+idx);
			arrMotor[idx].tampilNilai();
		}
	}
	public static void main(String[] args) {
		inputNilai();
		tampilNilai();
		
	}

	
	
	
}
