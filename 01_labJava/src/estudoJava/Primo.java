package estudoJava;

/* Apresentar se numero digitado e Primo
  2, 3, 5, 7, 11, 13, 17, 19
  23, 29, 31, 37, 41, 43, 
  47, 53, 59, 61, 67, 71, 
  73, 79, 83, 89, 97
 */

import java.util.Scanner;

public class Primo{
	
	public static void main(String[] args) {
		int verifica;
		int contador = 0;
		int i;

		var teclado = new Scanner(System.in);

		System.out.println("digite numero para verifica��o");
		 verifica = teclado.nextInt();
		 teclado.close();

		for (i=1; i <= verifica; i++) {
			
			if(verifica %i == 0) {
			contador ++;
			}
		}
			if(contador == 2) {
				System.out.println(verifica+ " numero primo");	
			}
			else System.out.println(verifica+ "  n�o primo");

	}
	}




