package formaCerta;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO
public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do DESIGNER");
        return 200;
    }
}
