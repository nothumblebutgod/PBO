//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/* Pertanyaan
   Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 */

/* Penyelesaian: 
   Tidak dieksekusi, karena pada baris 12 dan baris 21 tidak bisa dieksekusi karena class AngkaSialException belum dibuat,maka perlu 
   adanya pembuatan class AngkaSialException terlebih dahulu yang merupakan turunan dari class exception
*/