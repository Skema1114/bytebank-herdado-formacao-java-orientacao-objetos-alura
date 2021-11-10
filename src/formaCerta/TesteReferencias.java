package formaCerta;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario gerFuncionario = new Gerente();

        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setSalario(1000);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setSalario(1000);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setNome("Pedro");
        editorVideo.setSalario(1000);

        Designer designer = new Designer();
        designer.setNome("Paulo");
        designer.setSalario(1000);

        String nome = gerente.getNome();
        System.out.println(nome);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registrar(gerente);
        controle.registrar(funcionario);
        controle.registrar(editorVideo);
        controle.registrar(designer);

        System.out.println(controle.getSoma());
    }
}
