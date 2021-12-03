package exercicios;

import java.util.Scanner;

/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite os dois numero");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();

        if(n1 < n2){
            System.out.printf("%d, %d \n",n1, n2);
        }else{
            System.out.println(n2 + ", " + n1);
        }

        entrada.close();


    }
}