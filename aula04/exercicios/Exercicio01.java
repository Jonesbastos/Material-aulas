package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um numero inteiro");
        numero = entrada.nextInt();

        if(numero > 20) {
            metade = (double) numero / 2;
            System.out.println("Metade = " + metade);

        }

        entrada.close();
    }

}
