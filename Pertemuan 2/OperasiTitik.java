//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class OperasiTitik {

    private void refleksiSumbuX(Titik titik){
        double y;
        y = titik.getOrdinat();
        y *= -1;
        titik.setOrdinat(y);
    }
    
    private void refleksiSumbuY(Titik titik){
        double x;
        x = titik.getAbsis();
        x *= -1;
        titik.setAbsis(x);
    }

    public void refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return;
    }    

    public void refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return;
    }
}  