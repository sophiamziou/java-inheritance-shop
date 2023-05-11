package org.java.shop;

import org.java.shop.pojo.Cuffie;
import org.java.shop.pojo.Prodotto;
import org.java.shop.pojo.Smartphone;
import org.java.shop.pojo.Televisore;

public class Shop {
	
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("prodotto1", "marcaP1", 100, 22.0);
		Televisore t1 = new Televisore("tv1", "marcaT1", 200, 22.0, 32, false);
		Smartphone s1 = new Smartphone("smart1", "marcaS1", 600, 22.0, 123474682, 125);
		Cuffie c1 = new Cuffie("cuffie1", "marcaC1", 50, 14.0, "nero", false);
		
		//System.out.println(p1);
		//System.out.println(t1);
		//System.out.println(s1);
		//System.out.println(c1);
		
		
	}
	
}
