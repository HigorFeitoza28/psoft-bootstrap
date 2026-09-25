import java.util.List;

public class Venda {
    private Cliente cliente;
    private Pagamento pagamento;
    private List<ItemVenda> itens;

    public Venda(Cliente cliente, Pagamento pagamento, List<ItemVenda> itens) {
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        if (cliente.getAssinatura().equals("premium")) {
            total *= 0.95;
        }
        return total;
    }
}
