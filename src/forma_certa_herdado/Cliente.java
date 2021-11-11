package forma_certa_herdado;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
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
