package br.fastfood.model;

public class Bebida implements ItemCombo{
    private String nome;
    private double preco;

    public Bebida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    @Override public String toString() {
        return nome + " R$" + preco;
    }
    public static Bebida Coca_Cola() {
        return new Bebida("Coca Cola", 10.00);
    }
    public static Bebida Suco() {
        return new Bebida("Suco", 8.00);
    }

}
