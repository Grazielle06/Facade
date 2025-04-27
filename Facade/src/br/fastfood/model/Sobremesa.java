package br.fastfood.model;

public class Sobremesa implements ItemCombo{
    private String nome;
    private double preco;

    public Sobremesa(String nome, double preco){
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
    public static Sobremesa Sundae() {
        return new Sobremesa("Sundae Chocolate", 15.00);
    }
    public static Sobremesa Tortinha() {
        return new Sobremesa("Tortinha de banana", 9.00);
    }
}
