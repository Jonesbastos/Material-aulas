package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {

        // printf( FORMATO DE DADOS)
        // FORMATOS:
        // %d = inteiro
        // %f = decimal
        // %s = texto
        // \n = pula de linha
        // % .2 F = 2 casas decimais com arredondamento

        System.out.printf("O numero é %d\n", 10);

        System.out.printf("os numeros são  %d e %d\n", 10, 15);

        System.out.printf("A media é %f\n", 45.6754321);
        
        System.out.printf("A media é %.2f\n", 45.6754321);
    }
}
