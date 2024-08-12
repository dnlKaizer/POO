public class Item {
    Produto produto;
    float preco;
    int quantidade;

    private Item(Produto produto, float preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static Item getInstance(Produto produto, int quantidade) {
        if (produto == null) return null;
        if (quantidade <= 0) return null;
        return new Item(produto, produto.getPreco(), quantidade);
    }

    public Produto getProduto() {
        return produto.copy();
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void merge(Item item2) {
        quantidade += item2.getQuantidade();
    }
}
