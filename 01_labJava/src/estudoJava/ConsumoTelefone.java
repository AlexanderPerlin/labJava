/*
Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito
a 100 minutos de telefone cada minuto que exceder a franquia de 100 minutos 
custa R$ 2,00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,
daí mostrar o valor a ser pago.

variaveis

consumoReal: minutos utilizados
tarifaReal: valor a ser pago 
consumoExced: recebe os minutos excedentes para cálculo

constantes:
minutos sem tarifa extra: 100
valor da tarifa extra : 2
valor tarifa basica: 50

*/


package estudoJava;
import java.util.Scanner;
public class ConsumoTelefone {

	public static void main(String[] args) {

		double consumoReal, consumoExced, tarifaReal;
		var sc = new Scanner(System.in);
		

		System.out.println("Quantos minutos foram utilizados? ");
		consumoReal = sc.nextDouble();
		sc.close();

		
		if (consumoReal > 100) {
			consumoExced =	consumoReal - 100;
			tarifaReal = (consumoExced * 2) + 50;
			System.out.println("valor a ser pago R$ " + tarifaReal);
		
		}
		else 
			System.out.println("valor a ser pago R$ 50,00" );
			
	}

}
