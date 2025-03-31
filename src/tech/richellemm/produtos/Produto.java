package tech.richellemm.produtos;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int qtdEstoque;
    private int qtdEstoqueInicial;
    private int qtdVendida;

    public Produto(String nomeProduto, double precoProduto, int qtdEstoque) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdEstoque = qtdEstoque;
        this.qtdEstoqueInicial = qtdEstoque;
        this.qtdVendida = 0;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public int getQtdEstoqueInicial() {
        return qtdEstoqueInicial;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }


    public boolean decrementarEstoque(int qtdVendida) {
        if (qtdVendida > 0 && qtdVendida <= this.qtdEstoque) {
            this.qtdEstoque -= qtdVendida;
            this.qtdVendida = qtdVendida;
            return true;
        } else {
            return false;
        }
    }

    public void exibirInfoProduto() {
        System.out.println("=== Informações do Produto ===");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: R$ " + String.format("%.2f", precoProduto));
        System.out.println("Estoque antes da venda: " + qtdEstoqueInicial + " unidades");
        System.out.println("Venda realizada: " + qtdVendida + " unidades");
        System.out.println("Estoque atualizado: " + qtdEstoque + " unidades");
    }
}