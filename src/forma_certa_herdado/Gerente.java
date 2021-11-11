package forma_certa_herdado;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO E ASSINA O CONTRATO AUTENTICÁVEL ou É UM AUTENTICÁVEL
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
    }

    @Override
    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
