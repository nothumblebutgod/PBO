//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        //Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        //Mengambil elemen pertama
        System.out.println(map.get(1));

        //Mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> keys = map.keySet();
    }
}
