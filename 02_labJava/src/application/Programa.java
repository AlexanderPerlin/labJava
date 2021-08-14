package application;

import java.util.Scanner;

import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa p1 = new Pessoa();

		System.out.println("Nome, CPF, Data de Nascimento ");
		
		String nome = sc.nextLine();
		long cpf = sc.nextLong();
		int ano = sc.nextInt();

		p1.setNome(nome);
		p1.setCpf(cpf);
		p1.setAnoNascimento(ano);

		System.out.println(p1.toString());

		sc.close();
	}

}
