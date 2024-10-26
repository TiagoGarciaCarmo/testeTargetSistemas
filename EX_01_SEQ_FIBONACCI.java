/*
 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
    sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde, informado um número, 
    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se 
    o número informado pertence ou não a sequência.

 */

import java.util.Scanner;

public class EX_01_SEQ_FIBONACCI {
    public static void main(String[] args) throws Exception {
        int numero, numeroFibonacci, numeroFibonacci2, resultado, guardarNumero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para saber se está presente na sequencia de Fibonacci");
        numero = entrada.nextInt();
        numeroFibonacci = 0;
        numeroFibonacci2 = 1;
        guardarNumero = 0;
        System.out.println("\n"+numeroFibonacci);
        System.out.println(numeroFibonacci2);

        for (int i = 1; i <= 20; i++) {
            resultado = numeroFibonacci + numeroFibonacci2;
            numeroFibonacci = numeroFibonacci2;
            numeroFibonacci2 = resultado;
            System.out.println(resultado);

            if (resultado == numero) {
                guardarNumero = numero;
            }
        }

        if (numero == guardarNumero) {
            System.out.println("\nO número " + numero + " está presente na sequencia de Finonacci");
        } else {
            System.out.println("\nO número " + numero + " não está presente na sequência de Finonacci");
        }

        entrada.close();
    }
}