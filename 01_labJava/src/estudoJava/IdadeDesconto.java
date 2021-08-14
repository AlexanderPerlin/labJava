package estudoJava;
import java.util.Scanner;
public class IdadeDesconto {

	public static void main(String[] args) {
		
	//	String varNome;
		int idade;
		
		var sc = new Scanner(System.in);
		
		System.out.println("Digite a idade para apresentar desconto ");
		idade = sc.nextInt();
		sc.close();
		
		int desconto = (idade < 50)? 50 : 70;
		
		System.out.println(desconto+"% de desconto");
		
		

	}

}
