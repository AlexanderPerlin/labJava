/*
 1. Desenvolva um software em Java que leia dois valores digitados pelo
 usu�rio. Calcule e mostre a multiplica��o dos dois valores ao quadrado.
 */
package estudoJava;

/**
 *
 * @author alexander perlin
 */
import java.util.Scanner;

public class SomaValores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float valor_01, valor_02, resultado, multi;

        System.out.println("Informe o primeiro valor a ser calculado");
        valor_01 = teclado.nextFloat();

        System.out.println("Informe o segundo valor a ser calculado");
        valor_02 = teclado.nextFloat();

        multi = valor_01 * valor_02;
        resultado = multi * multi;

        System.out.println("Resultado da equa��o � " + resultado);
teclado.close();

    }
}
