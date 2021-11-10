package herdado_conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }
}
