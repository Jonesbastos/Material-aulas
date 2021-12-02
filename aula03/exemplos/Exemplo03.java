package exemplos;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
         // criar um scaner para ler o teclado
         Scanner entrada = new Scanner(System.in);
         int idade;

         System.out.println("Digite sua idade:");
         idade = entrada.nextInt(); // lê um valor inteiro do teclado e gurada na variavel idade

         System.out.println("Você tem " + idade + " anos"); // concatenar = juntar


         entrada.close();
    }
    
}
