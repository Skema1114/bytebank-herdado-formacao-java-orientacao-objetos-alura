package forma_certa_herdado;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemInterno = new SistemaInterno();
        sistemInterno.autententicar(gerente);
        sistemInterno.autententicar(adm);
        sistemInterno.autententicar(cliente);
    }
}
