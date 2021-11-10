package formaCerta;

public class ControleBonificacao {
    private double soma;

    public void registrar(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    /*
        public void registrar(Gerente gerente) {
            double bonificacao = gerente.getBonificacao();
            this.soma = this.soma + bonificacao;
        }

        public void registrar(EditorVideo editorVideo) {
            double bonificacao = editorVideo.getBonificacao();
            this.soma = this.soma + bonificacao;
        }
    */

    public double getSoma() {
        return soma;
    }
}
