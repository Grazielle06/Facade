package br.fastfood.model;

public class Combo {
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;
   // private double precoTotal;


    public Combo(ItemCombo burger,ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }
    public ItemCombo[] getItens() {
        return new ItemCombo[]{burger, bebida, sobremesa};
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}