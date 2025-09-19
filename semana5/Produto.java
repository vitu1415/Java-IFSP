package semana5;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){

    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] Args){
        Produto produto = new Produto();
        Produto produto1 = new Produto("vitor", 20.50);
        Produto produto2 = new Produto("Vitor 2", 25.00, 10);
        System.out.println(produto.nome);
        System.out.println(produto1.preco);
        System.out.println(produto2.quantidade);
    }
}
