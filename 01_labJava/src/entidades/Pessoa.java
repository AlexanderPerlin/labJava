package entidades;

public class Pessoa {

	private String nome;
	private int cpf;
	private int anoNascimento;
	private int idade;
	
	public Pessoa () {
		
	}
	
	public Pessoa(String nome, int cpf, int anoNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	
	public int idade (int anoNascimento) {
		
		return this.idade = this.getAnoNascimento() - 2021;
	
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", anoNascimento=" + anoNascimento + "]";
	}
	
	
	
	
	
	
}
