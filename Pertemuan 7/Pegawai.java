//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class Pegawai {
    private String nama;
    private int gajiPokok;

    public void SetNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok);
    }
}