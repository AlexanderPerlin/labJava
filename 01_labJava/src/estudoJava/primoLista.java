/* Exibir lista de numeros primos at� o test definido pelo usuario, exemplo 100
2, 3, 5, 7, 11, 13, 17, 19,23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
73, 79, 83, 89, 97 */

package estudoJava;
import java.util.Scanner;

public class primoLista {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int limite, y, contador = 0;
		
		System.out.printf("digite o limite: ");
		limite = sc.nextInt();
		sc.close();
		
	for( y = 1; y<=limite; y++) {
		
		for(int i=1; i<=y; i++) {
			if(y %i==0) {
				contador++;				
			}
							
		}
			if(contador == 2) {
				System.out.printf(y+", ");
			}
			contador = 0;
	}
					
	}

}

