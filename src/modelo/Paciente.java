package modelo;


public class Paciente {
	//classe modelo de paciente com seus dados, getters, setters, construtor vazio...
    protected String nome;
    protected String cpf;
    protected int anoNascimento;

    public Paciente(String nome, String cpf, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }
//construtor com nome, cpf e anoNascimento
    public Paciente(){
//construtor vazio
    }

    @Override
    public String toString() {
		System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nAno de nascimento: " + anoNascimento);
		return super.toString();
	}
    //tostring para impressão dos dados


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

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
//getters e setters
  
    
}