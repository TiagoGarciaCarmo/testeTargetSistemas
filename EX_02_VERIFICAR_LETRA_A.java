/*
 Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, 
 além de informar a quantidade de vezes em que ela ocorre.
 IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 */

import java.util.Scanner;

public class EX_02_VERIFICAR_LETRA_A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra ou frase:");
        palavra = entrada.nextLine();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador ++;
            }
        }

        if (contador > 0) {
            System.out.println("\nA letra 'a ou A' foi encontrada " + contador + " vezes.");
        } else {System.err.println("\nA letra 'a ou A' não foi encontrada.");}

        entrada.close();
    }
}
