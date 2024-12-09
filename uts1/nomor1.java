 package uts1;

public class nomor1 {
	
public static int [][] matNilai = new int [5][5];
	

	public static void tampilNilai() {
		for(int baris = 0; baris < 5;baris++) {
			for(int kolom = 0; kolom <5; kolom++) {
				if (baris == 2 || kolom == 2) {
				System.out.print("x");
				}
				else {
					System.out.print("+");
				}
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		
		tampilNilai();
		
	}
}
