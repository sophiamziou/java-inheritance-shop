package org.java.shop.pojo;

import java.util.Random;

public class Prodotto {
    private final int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, String marca, double prezzo, double iva) {
    	this.codice = new Random().nextInt(1000000);
    	setNome(nome);
    	setMarca(marca);
    	setPrezzo(prezzo);
    	setIva(iva);
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    public double getPrezzoIva() {
        return getPrezzo() * (1 + getIva() / 100);
    }
    
    protected String getString() {
        return
        		"\n codice= " +  getCodice() + 
                "\n nome= '" + getNome() + '\'' + 
                "\n marca= '" + getMarca()  + '\'' + 
                "\n prezzo= " + getPrezzo() + "€ (" + getIva() + "%)" +
                "\n iva= " + getPrezzoIva();
    }
    
    @Override
    public String toString() {
    	return "prodotto" + getString();
    }

}

