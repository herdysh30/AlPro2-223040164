package pertemuan10.bubbleSort;

public class Bubble2 {
	/*
	 * Kita akan membuat sebuah program pengurutan array String menggunakan bubble sort, 
	 * dengan spesifikasi berikut
	 * a. Buat kelas dengan nama BubbleSortString, dimana di dalamnya terdapat sebuah 
	 * variable global array dengan nama arrNama. Isi dari arrNama adalah "Fauzan","yoga
	 * "Vina", "Viane", "Daffa", "Yogi", "Adam", "audi"
	 * b. Buatlah prosedur untuk mengurutkan nilai pada arrNama secara ascending (dari kecil ke 
	 * besar) dengan menggunakan bubble sort. Lalu buat juga prosedur untuk tampil nilai
	 * pada arrNilai
	 * c. Pada main panggillah prosedur tampil (sebelum diurutkan), prosedur pengurutan, 
	 * prosedur tampil (setelah diurutkan)
	 */
	
	static String [] arrNama = {"Fauzan", "Yoga", "Vina", "Viane", "Daffa", "Yogi", "Adam", "Audi"};
	// array yang menampung nilai secara acak
	
	static void bSort() {
		System.out.println("Proses pengurutan");
		int iCek, iNext;
		String iTemp;
		for (int loop = 0; loop < arrNama.length;loop++) {
			/*
			 * loop agar menjamin semua terurut
			 * Karena satu putaran hanya menghasilkan satu nilai yang urut
			 */
			for (int i =0;i<arrNama.length-(loop+1);i++) {
				//loop untuk membandingkan dari elemen 0 sampai elemen akhir tiap putarannya
				iCek = i;
				iNext=i+1;
				if (arrNama[iCek].compareToIgnoreCase(arrNama[iNext])>0) {
					//arrNama [iCek] > arrNama[iNext]
					//untuk membandingkan antara String n dengan String n+1
					iTemp = arrNama[iCek];
					arrNama[iCek]=arrNama[iNext];
					arrNama[iNext]=iTemp;
					System.out.print(".");
				}
			}
			
		}
		System.out.println("Selesai");
	}
	
	static void tampilArray() {
		for(int a=0;a<arrNama.length;a++) {
			System.out.println(arrNama[a]);
		}
	}
	public static void main(String[] args) {
		System.out.println("=============Bubble Sort==============");
		tampilArray();
		bSort();
		tampilArray();
	}
}
