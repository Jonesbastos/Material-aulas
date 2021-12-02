package exercicios;

import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double TAXA_POR_KW = 500;
        double salarioMinimo, kwConsumida;
        double valorKW, valorTotal, valorComDesconto;

        System.out.println("Informa salario minimo");
        salarioMinimo = entrada.nextDouble();

        System.out.println("informa kw consumidos");
        kwConsumida = entrada.nextDouble();

        valorTotal = valorKW * kwConsumida;

        valorKW = salarioMinimo / TAXA_POR_KW;

        valorComDesconto = valorTotal - valorTotal * 0.15;
        

        System.out.println("Valor a ser pago com desconto é " + valorTotal);
        System.out.println("1 Kw custa " + valorKW);
        System.out.println("Valor com 15% de desconto: " + valorComDesconto);

        entrada.close();


    }
    
}
