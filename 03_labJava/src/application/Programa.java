
package application;

import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Produto[] vect = new Produto[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();

			vect[i] = new Produto(nome, preco);

		}

		for (int i = 0; i < vect.length; i++) {

			System.out.println(vect[i].getNome() + " " + vect[i].getPreco());

		}

		sc.close();

	}

}
