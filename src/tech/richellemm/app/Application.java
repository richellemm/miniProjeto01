
package tech.richellemm.app;
import java.util.Scanner;

import tech.richellemm.produtos.Produto;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(">>>> Cadastro de Produto <<<<");
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = sc.nextDouble();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int qtdEstoqueInicial = sc.nextInt();
        sc.nextLine();

       Produto produto = new Produto(nomeProduto, precoProduto, qtdEstoqueInicial);

       System.out.println();
       produto.exibirInfoProduto();

        System.out.println("\n >>>> Registrar Venda <<<<");
        System.out.print("Digite a quantidade vendida: ");
        int qtdVendida = sc.nextInt();


        if (produto.decrementarEstoque(qtdVendida)) {
            System.out.println("Venda registrada com sucesso!");
            System.out.println();
            produto.exibirInfoProduto();
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
            System.out.println("Quantidade disponível em estoque: " + produto.getQtdEstoque() + " unidades.");
        }

        sc.close();
    }
}