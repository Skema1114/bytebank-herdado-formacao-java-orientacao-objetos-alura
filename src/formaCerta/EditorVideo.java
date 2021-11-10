package formaCerta;

// GERENTE É UM FUNCIONÁRIO ou GERENTE HERDA DA CLASSE FUNCIONÁRIO
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do EDITORVIDEO");
        return super.getBonificacao() + 1000;
    }
}
