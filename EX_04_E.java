public class EX_04_E {
    public static void main(String[] args) throws Exception {
        int numeroFibonacci, numeroFibonacci2, resultado;
        numeroFibonacci = 1;
        numeroFibonacci2 = 1;
        System.out.println(numeroFibonacci);
        System.out.println(numeroFibonacci2);

        for (int i = 1; i <= 10; i++) {
            resultado = numeroFibonacci + numeroFibonacci2;
            numeroFibonacci = numeroFibonacci2;
            numeroFibonacci2 = resultado;
            System.out.println(resultado);
        }
    }
}