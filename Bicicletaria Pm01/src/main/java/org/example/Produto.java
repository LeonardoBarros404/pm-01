package org.example;

public class Produto {
    public String nome;
    public double preco;
    public int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome=nome;
        this.preco=preco;
        this.qtdEstoque=qtdEstoque;
    }

    public abstract String getInfo();

    public void atualizarEstoque(int quantidade) {
        this.qtdEstoque +=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
         return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

}
