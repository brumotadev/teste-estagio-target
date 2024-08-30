package desafio.desafio2;

import java.util.Scanner;

public class Fibonacci {

    /**
     * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
     * - escreva um programa na linguagem que desejar onde, 
     * - informado um número, ele calcule a sequência de Fibonacci e 
     * - retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        if(verificaFibonacci(numero)) {
            System.out.printf("O número %d pertence a sequência Fibonacci.", numero);
        } else {
            System.out.printf("O número %d não pertence à sequência Fibonacci", numero);
        }
    }

    /**
     * 
     * Verifica se o numero informado é Fibonacci
     * 
     * @param numero
     * @return se o numero faz parte da sequencia Fibonacci ou não. true ou false
     */
    public static boolean verificaFibonacci(int numero) {
        // como a sequencia fibonacci inicia com 0 e 1. É feito a verificação se é um desses numeros. Para evitar entrar no while.
        if(numero == 0 || numero == 1) {
            return true;
        }

        // assim posso utilizar 0 e 1 para declarar os valores. Já que caso o valor informado fosse 0 e 1, o fluxo seria interrompido no if
        int num1 = 0;
        int num2 = 1;
        int fibonacci = num1 + num2;

        // enquanto o fibonacci for menor ou igual ao numero1 ele vai executar o while abaixo. Executando a soma do fibonacci.
        // E assim pode verificar se o numero informado é fibonacci ou não
        while (fibonacci <= numero) {
            if (fibonacci == numero) { // se o numero informado for um fibonacci retorna true
                return true;
            }


            // aqui é a parte da logica pra soma dos numeros fibonacci. Assim é possivel verificar depois se o numero informado é fibonacci ou não
            num1 = num2;
            num2 = fibonacci;
            fibonacci = num1 + num2;
        }

        return false;
    }
}
