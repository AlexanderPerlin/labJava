/*
 3. Desenvolva um software em Java que pe?a para o usu?rio informar quatro
 valores. Some o primeiro valor pelo segundo, divida pelo terceiro valor digitado
 e multiplique o resultado pelo quarto valor digitado. Escreva na tela o resultado.

 */
package estudoJava;

/**
 *
 * @author alexander perlin
 */
import java.util.Scanner;

public class ExpressaoMatematica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float valor_01, valor_02, valor_03, valor_04, resultado;

        System.out.println("Informe o primeiro valor a ser calculado");
        valor_01 = teclado.nextFloat();

        System.out.println("Informe o segundo valor a ser calculado");
        valor_02 = teclado.nextFloat();

        System.out.println("Informe o terceiro valor a ser calculado");
        valor_03 = teclado.nextFloat();

        System.out.println("Informe o quarto valor a ser calculado");
        valor_04 = teclado.nextFloat();

        resultado = (valor_01 + valor_02) / valor_03 * valor_04;

        System.out.println("Resultado da equa??o ? " + resultado);
teclado.close();
    }

}
