package forma_certa_herdado;

import java.lang.reflect.Constructor;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO ...
// ... E ASSINA O CONTRATO AUTENTICÁVEL ou É UM AUTENTICÁVEL
public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
    }

    @Override
    public boolean autenticar(int senha) {
        boolean autenticou = this.autenticador.autenticar(senha);
        return autenticou;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
