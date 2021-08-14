package entidade;

public class Pessoa {

	private String nome;
	private long cpf;
	private int anoNascimento;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int idade() {

		return 2021 - this.getAnoNascimento();

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + this.idade() + "]";
	}

}
