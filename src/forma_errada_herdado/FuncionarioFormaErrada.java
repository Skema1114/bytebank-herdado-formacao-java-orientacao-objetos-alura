package forma_errada_herdado;

public class FuncionarioFormaErrada {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; // 0 - FUNCIONÁRIO COMUM, 1 - GERENTE, 2 - DIRETOR
    private int senha;

    public boolean autentica(int senha) {
        // ESSE MÉTODO É SÓ PARA GERENTE, POIS É SO ELE QUE PRECISA TER SENHA
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }

    public double getBonificacao() {
        if (this.tipo == 0) {
            // FUNCIONÁRIO COMUM
            return this.salario * 0.10;

        } else if (this.tipo == 1) {
            // GERENTE
            return this.salario + this.salario;

        } else {
            // DIRETOR
            return this.salario + this.salario + this.salario;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
