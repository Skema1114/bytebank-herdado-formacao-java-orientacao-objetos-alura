package herdado_conta;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1212, 2121);
        cc.depositar(100);

        SeguroVida seguroVida = new SeguroVida();
        CalculadorImposto calcImposto = new CalculadorImposto();

        calcImposto.registrar(cc);
        calcImposto.registrar(seguroVida);

        System.out.println(calcImposto.getTotalImposto());
    }
}
