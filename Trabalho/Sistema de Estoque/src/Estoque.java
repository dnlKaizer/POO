public class Estoque {
    Produto[] produtos = new Produto[10];
    int nProdutos = 0;
    int codigo = 1;

    /* Inserir novo produto */
    boolean inserir(Produto novoProduto) {
        if (novoProduto != null) {
            /* Verificar se a lista de produtos está cheia */
            if (nProdutos == produtos.length) {
                Produto[] vetAux = new Produto[nProdutos * 2];
                for (int i = 0; i < nProdutos; i++) {
                    vetAux[i] = produtos[i];
                }
                produtos = vetAux;
            }
            if (!verificaNome(novoProduto)) {
                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i] == null) {
                        produtos[i] = new Produto();
                        
                        produtos[i].addCodigo(codigo);
                        produtos[i].addNome(novoProduto.lerNome());
                        produtos[i].addMarca(novoProduto.lerMarca());
                        produtos[i].addPreco(novoProduto.lerPreco());
                        produtos[i].addQuantidade(novoProduto.lerQuantidade());

                        codigo++;
                        nProdutos++;
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* Verifica se existe produto com mesmo nome */
    private boolean verificaNome(Produto novoProduto) {
        for (int i = 0; i < nProdutos; i++) {
            if (produtos[i].nome.equalsIgnoreCase(novoProduto.nome)) {
                return true;
            } 
        }
        return false;
    }
}
