package herdado_conta;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200);

        cc.transferir(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
