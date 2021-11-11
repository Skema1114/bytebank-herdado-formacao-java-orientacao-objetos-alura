package herdado_conta;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
