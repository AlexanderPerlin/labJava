/*
 2. Desenvolva um software em Java que leia o n�mero de horas trabalhadas e
 o valor que recebe por hora. Calcule e escreva na tela o sal�rio bruto deste
 funcion�rio.
 */
package estudoJava;

/**
 *
 * @author alexander perlin
 */
import java.util.Scanner;

public class HoraTrabalho {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float valor_01, valor_02, resultado;

        System.out.println("Informe quantas horas foram trabalhadas");
        valor_01 = teclado.nextFloat();

        System.out.println("Informe o valor recebido por hora");
        valor_02 = teclado.nextFloat();

        resultado = valor_01 * valor_02;

        System.out.println("Seu sal�rio bruto � R$" + resultado);
teclado.close();
    }

}
