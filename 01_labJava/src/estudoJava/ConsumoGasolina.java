
/*
 4. Um motorista deseja colocar no tanque um valor X em reais de gasolina.
 Desenvolva um software em Java para ler o pre�o do litro da gasolina e o valor
 que o motorista ir� pagar, calcule e mostre na tela quantos litros ele conseguir�
 colocar no tanque.
 */
package estudoJava;

/**
 *
 * @author alexander perlin
 */
import java.util.Scanner;

public class ConsumoGasolina {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float valor_01, valor_02, resultado;

        System.out.println("Informe o pre�o do litro da gasolina");
        valor_01 = teclado.nextFloat();

        System.out.println("Informe quanto dinheiro ser� utilizado");
        valor_02 = teclado.nextFloat();

        resultado = valor_02 / valor_01;

        System.out.println("Quantidade de gasolina ser� " + resultado + " litros");
teclado.close();

    }
}

