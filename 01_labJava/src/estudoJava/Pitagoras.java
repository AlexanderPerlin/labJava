package estudoJava;
import java.util.Scanner;

public class Pitagoras {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		double valorA, valorB, valorC;
		
		System.out.println("Valores");
		valorA = sc.nextDouble();
		valorB = sc.nextDouble();
		valorC = sc.nextDouble();
		
		double area = Math.pow(valorA,2)+ Math.pow(valorB,2)+Math.pow(valorC,2);
		
		System.out.println(area);
		
sc.close();
	}
	
}
