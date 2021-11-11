package forma_certa_herdado;

// contrato Autenticável
// quem quiser esse contrato precisa implementar os métodos abaixo

public abstract interface Autenticavel {
    public abstract boolean autenticar(int senha);

    public abstract void setSenha(int senha);
}
