import java.util.Scanner;

public class EX_05_INTERRUPTOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Simulando as lâmpadas e seus interruptores
        boolean[] lamps = { false, false, false }; // Estado das lâmpadas (false = apagada, true = acesa)

        // Liga o primeiro interruptor
        System.out.println("Ligue o primeiro interruptor (I1).");
        lamps[0] = true; // Lâmpada correspondente a I1 é acesa
        System.out.println("\nAguarde 10-15 minutos...");

        // Desliga o primeiro interruptor e liga o segundo
        System.out.println("\nDesligue o primeiro interruptor (I1) e ligue o segundo (I2).");
        lamps[0] = false;
        lamps[1] = true; // Lâmpada correspondente a I2 é acesa

        // Simulação da visita às lâmpadas
        System.out.println("\nAgora, vá até as lâmpadas e verifique:");

        System.out.println("\nDigite o estado das lâmpadas (1 - acesa, 0 - apagada):");
        int estado1 = scanner.nextInt(); // Estado da primeira lâmpada
        int estado2 = scanner.nextInt(); // Estado da segunda lâmpada
        int estado3 = scanner.nextInt(); // Estado da terceira lâmpada

        // estados das lâmpadas
        String[] resultados = new String[3];
        resultados[0] = (estado1 == 1) ? "I2" : "I1"; // Se a lâmpada 1 estiver acesa, controla I2
        resultados[1] = (estado2 == 1) ? "I2" : "I1"; // Se a lâmpada 2 estiver acesa, controla I2
        resultados[2] = (estado3 == 1) ? "I2" : "I1"; // Se a lâmpada 3 estiver acesa, controla I2

        System.out.println("Resultados:");
        System.out.println("Lâmpada 1 é controlada por: " + resultados[0]);
        System.out.println("Lâmpada 2 é controlada por: " + resultados[1]);
        System.out.println("Lâmpada 3 é controlada por: " + resultados[2]);

        scanner.close();
    }
}
