package estudoJava;
import java.util.Scanner;
public class Estrutura_While {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
	
		System.out.println("Digite valor");
			int valor=sc.nextInt();
		
	int	result= 0;
		
			while(valor != 0) {
			result = result+valor;
				valor=sc.nextInt();
						
	}
System.out.println(result);
	sc.close();		
}
}
