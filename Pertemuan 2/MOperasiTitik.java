//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class MOperasiTitik{

    public static void main (String[] args){
        Titik t = new Titik(3,4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik1: (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiX(t); //hasil
        System.out.println("Titik Refleksi terhadap sumbu X : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiY(t); //hasil
        System.out.println("Titik Refleksi terhadap sumbu Y : (" + t.getAbsis()+", "+t.getOrdinat() +")");
    }
}