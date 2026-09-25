public class Cliente {
    int id;
    String assinatura;

    public Cliente(int id) {
        this.id = id;
        this.assinatura = "standard";
    }

    public void definirStandard() {
        assinatura = "standard";
    }

    public void definirPremium() {
        assinatura = "premium";
    }
}
