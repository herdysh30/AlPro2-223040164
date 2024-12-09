package uts1;


public class Karyawan {
	
	private String sId, sNama, sJenis;
	private int iHarga;
	
	public void inputNilai(String id, String nama, String jenis, int harga) {
		sId = id;
		sNama = nama;
		sJenis = jenis;
		iHarga = harga;
		
	}
	
	public void tampilNilai () {
		System.out.println("ID    : "+ sId);
		System.out.println("Nama  : "+ sNama);
		System.out.println("Jenis : "+ sJenis);
		System.out.println("Harga : "+ iHarga);
	}
	
}