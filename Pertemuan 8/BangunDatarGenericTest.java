//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran 1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe generic : "+bdg.get().getClass().getName());
    }
}
