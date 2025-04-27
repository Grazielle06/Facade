package br.fastfood.model;

public class Burger implements ItemCombo{
    private String nome;
    private double preco;

    public Burger(String nome, double preco){
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
    public static Burger BigCheddar() {
        return new Burger("Big Cheddar", 25.00);
    }
    public static Burger CBO() {
        return new Burger("CBO", 35.00);
    }
}
