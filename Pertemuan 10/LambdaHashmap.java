import java.util.HashMap;

//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("Dienara", "24060121140118");
        mahasiswaMap.put("Priscilla", "24060121137171");
        mahasiswaMap.put("Boy", "24060121140781");
        mahasiswaMap.put("Kinanti", "24060121120191");

        // menggunakan lambda
        mahasiswaMap.forEach((nama, nim) -> System.out.println(nama + " : " + nim));
    }
}