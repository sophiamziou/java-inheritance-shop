package org.java.shop.pojo;
public class Smartphone extends Prodotto {
    private int imei;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, double iva, int imei, int memoria) {
        super(nome, marca, prezzo, iva);
        setMemoria(memoria);
        setImei(imei);

    }

    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void setImei(int imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
    	return "smartphone" + getString() + 
    			"\n memoria= " +  getMemoria() + 
                "\n IMEI= '" + getImei();
    }
}

