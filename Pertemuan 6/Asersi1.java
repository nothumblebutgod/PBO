//Nama : Ananda Rizky Pratama
//NIM : 24060121140118
//LAB : C1

public class Asersi1{
  public static void main (String[] args){
    int x = 0;
	if(x > 0){
	  System.out.println("x bilangan positif");
	}else{
	  assert(x < 0): "ada kesalahan kode";
	  System.out.println("x bilangan negatif");
	}
  }
}
