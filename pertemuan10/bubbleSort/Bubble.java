package pertemuan10.bubbleSort;

public class Bubble {
	/*Kita akan membuat sebuah program pengurutan array int menggunakan bubble sort, dengan
	 * spesifikasi berikut
	 * a. Buat kelas dengan nama BubbleSort, dimana di dalamnya terdapat sebuah variable
		global array dengan nama arrNilai. Isi dari arrNilai adalah 64, 21, 88, 1, 20, 12, 70, 46, 33,
		51, 99
	 *b. Buatlah prosedur untuk mengurutkan nilai pada arrNilai secara ascending (dari kecil ke
		besar) dengan menggunakan bubble sort. Lalu buat juga prosedur untuk tampil nilai
		pada arrNilai
	 * c. Pada main panggillah prosedur tampil (sebelum diurutkan), prosedur pengurutan,
prosedur tampil (setelah diurutkan)
	 */
	
	static int [] arrNilai = {64, 21, 88, 1, 20, 12, 70, 46, 33, 51, 99};
	//array yang menampung nilai secara acak
	
	static void bSort() {
		/*
		 * Proses pengurutan dengan metode bubble sort
		 * pengurutan yang membandingkan satu elemen hanya dengan elemen selanjutnya (tetangganya)
		 */
		System.out.println("proses pengurutan");
		int iCek, iNext;//menyimpan index elemen yang sedang dicek dan next dari elemen yang dicek
		int iTemp;
		for (int loop = 0; loop < arrNilai.length; loop++) {
			/*
			 * loop agar menjamin semua terurut
			 * karena satut putaran hanya menghasilkan satu nilai yang urut
			 */
			for (int i = 0; i< (arrNilai.length-(loop+1));i++) {
				//loop untuk membandingkan dari elemen 0 sampai elemen akhir tiap putarannya
				iCek = i;
				iNext = i+1;
				if (arrNilai [iCek] > arrNilai [iNext]) {
					//jika elemen n lebih besar dari n+1, maka akan erjadi pertukaran
					iTemp = arrNilai[iCek];
					arrNilai[iCek]=arrNilai[iNext];
					arrNilai[iNext]=iTemp;
				}
			}
		}
		System.out.println("Selesai");
	}
	static void tampilArray() {
		for(int a=0; a< arrNilai.length;a++) {
			System.out.println(arrNilai[a]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("===============Bubble Sort================");
		tampilArray();
		bSort();
		tampilArray();
	}

}
