package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestação;

        System.out.println("Informe o salario bruto");
        salarioBruto = entrada.nextDouble();

        System.out.println("Informe o valor da prestação");
        prestação = entrada.nextDouble();

        if(prestação <= salarioBruto * 0.3){
            System.out.println("Emprestimo aprovado");
        }else{
            System.out.println("Emprestimo reprovado");
        }


        entrada.close();
    }
}
