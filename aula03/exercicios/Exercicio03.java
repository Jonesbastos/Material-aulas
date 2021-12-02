package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento, novoSalario;

        System.out.println("Informe o salario");
        salario = entrada.nextDouble();

        System.out.println("portecentgem do aumento");
        aumento = entrada.nextDouble();

        novoSalario = salario * aumento + salario;

        System.out.println("Novo salario é " + novoSalario);



        entrada.close();
    }
    
}
