package br.fastfood.app;
import java.util.Scanner;
import br.fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        int escolha = 0;
        while (escolha < 1 || escolha > 2) {
            System.out.print("Sua escolha (1 ou 2): ");
            if (in.hasNextInt()) {
                escolha = in.nextInt();
                if (escolha < 1 || escolha > 2) {
                    System.out.println("Escolha inválida! Por favor, digite 1 ou 2.");
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                in.next();
            }
        }
     ComboFacade facade = new ComboFacade();
     facade.criarCombo(escolha);
     facade.exibirItens();
     System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());
   }
}