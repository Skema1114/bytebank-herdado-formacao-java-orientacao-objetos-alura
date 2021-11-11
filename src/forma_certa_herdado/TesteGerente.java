package forma_certa_herdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Rafael");
        gerente.setCpf("123456789");
        gerente.setSalario(5000);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autenticar(2222);
        System.out.println(autenticou);
        System.out.println(gerente.getBonificacao());

        Autenticavel referencia1 = new Cliente();
        Autenticavel referencia2 = new Administrador();
        Autenticavel referencia3 = new Gerente();
    }
}
