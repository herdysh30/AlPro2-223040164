package pertemuan2.arrayrecord;

public class Motor {
/*
 * Ini adalah eklas record yaitu kelas yang mewakili suatu objek, memiliki
 * nama motor karena kita akan mengelola objek motor.
 * 
 * Atribut yang akan dimiliki adalah :
 * id 
 * merk
 * jenis
 * cc
 * harga
 * 
 * Dalam record atribut akan menjadi Field (variable global dalam record)
 * 
 */
	
	//field adalah variable global yang bersifat private
	//private itu tidak bisa diakses langsung oleh kelas lain
	
	private String sId, sMerk, sJenis, sCC;
	private int iHarga;
	
	public void inputNilai (String id, String merk, String jenis, String cc, int harga) {
		sId = id;
		sMerk = merk;
		sJenis = jenis;
		sCC = cc;
		iHarga = harga;
		
	}
	
	public void tampilNilai () {
		System.out.println("ID    : "+ sId);
		System.out.println("Merk  : "+ sMerk);
		System.out.println("Jenis : "+ sJenis);
		System.out.println("CC    : "+ sCC);
		System.out.println("Harga : "+ iHarga);
	}
	
	
	
	
	
	
	
	
	
	
}
