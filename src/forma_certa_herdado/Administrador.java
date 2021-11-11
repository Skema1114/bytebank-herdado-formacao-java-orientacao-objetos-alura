package forma_certa_herdado;

public class Administrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
