/*
 * File : BangunDatarGenericTest.java  17/05/2023
 * Penulis : Aprilyanto Setiyawan Siburian (24060121120022)
 * Deskripsi : main class untuk generic bangun datar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran 1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe generic : "+bdg.get().getClass().getName());
    }
}