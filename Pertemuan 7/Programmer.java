//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class Programmer extends Pegawai {
    private int bonus = 450000; 
    
    public Programmer(String nama) {
        super.SetNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}