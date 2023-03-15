//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

package org.main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujursangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujursangkar);
		System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
	}
}
