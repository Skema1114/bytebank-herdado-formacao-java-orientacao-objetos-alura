package herdado_conta;

public class CalculadorImposto {
    private double totalImposto;

    public void registrar(Tributavel tributo) {
        double valor = tributo.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
