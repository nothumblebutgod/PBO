//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1
//Deskripsi : Person database model

public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
