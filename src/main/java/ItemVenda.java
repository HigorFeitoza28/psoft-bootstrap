public class ItemVenda {
    Produto produto;
    int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        double subtotal = produto.valor * quantidade;
        if (quantidade >= 20) {
            subtotal *= 0.90;
        }
        return subtotal;
    }
}
