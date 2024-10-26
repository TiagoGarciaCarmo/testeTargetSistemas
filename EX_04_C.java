public class EX_04_C {
public static void main(String[] args) {
    int num1 = 0;
    int adicional = 1;
    System.out.println(num1);

    // 0 1 4 9 16 25 36  imprimir <<<
    //  1  3  5  7  9  11  diferença <<<

    for (int i = 0; i <= 20; i++) {
        num1 = num1 + adicional;
        adicional = adicional + 2;
        System.out.println(num1);
    }
}
}
