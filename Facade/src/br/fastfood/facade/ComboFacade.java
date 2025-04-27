package br.fastfood.facade;
import br.fastfood.model.Combo;
import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Sobremesa;
import br.fastfood.model.ItemCombo;

public class ComboFacade {

    private Combo combo;

    public void criarCombo(int tipo){
        switch(tipo) {
            case 1:
                combo = new Combo(
                        Burger.BigCheddar(),
                        Bebida.Coca_Cola(),
                        Sobremesa.Sundae()
                );
        break;
            case 2:
                combo = new Combo(
                        Burger.CBO(),
                        Bebida.Suco(),
                        Sobremesa.Tortinha()
                );
                break;
            default:
                System.out.println("Combo inválido. Por favor, escolha uma opção válida.");
                break;
        }
    }
    public void exibirItens() {
        if (combo != null) {
            for (ItemCombo item : combo.getItens()) {
                System.out.println(item);
            }
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }

    public double getPrecoTotal() {
        return combo != null ? combo.getPrecoTotal() : 0;
    }
}