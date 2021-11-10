package forma_errada_herdado;

public class TesteFuncionarioFormaErrada {
    public static void main(String[] args) {
        FuncionarioFormaErrada fabersom = new FuncionarioFormaErrada();
        fabersom.setSalario(3000);
        System.out.println(fabersom.getTipo());
        System.out.println(fabersom.getBonificacao());

        FuncionarioFormaErrada faberleia = new FuncionarioFormaErrada();
        faberleia.setTipo(1);
        faberleia.setSalario(3000);
        System.out.println(faberleia.getTipo());
        System.out.println(faberleia.getBonificacao());

        FuncionarioFormaErrada faberleianbersom = new FuncionarioFormaErrada();
        faberleianbersom.setTipo(2);
        faberleianbersom.setSalario(3000);
        System.out.println(faberleianbersom.getTipo());
        System.out.println(faberleianbersom.getBonificacao());
    }
}
