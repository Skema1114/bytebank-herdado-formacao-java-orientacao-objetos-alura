package formaCerta;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO
public class Gerente extends Funcionario {
    private int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
