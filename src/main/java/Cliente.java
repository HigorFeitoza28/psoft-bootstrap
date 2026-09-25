public class Cliente {
    private int id;
    private String assinatura;

    public Cliente(int id) {
        this.id = id;
        this.assinatura = "standard";
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void definirStandard() {
        assinatura = "standard";
    }

    public void definirPremium() {
        assinatura = "premium";
    }
}
