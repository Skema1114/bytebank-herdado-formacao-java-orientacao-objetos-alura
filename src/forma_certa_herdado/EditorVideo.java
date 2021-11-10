package forma_certa_herdado;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO
public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do EDITOR DE VÍDEO");
        return 150;
    }
}
