public class EX_04_D2VERSAO {
public static void main(String[] args) {
    int num1 = 2;
    System.out.println(num1*num1);

    // 4 16 36 64 100
    //  2^2, 4^2, 6^2, 8^2, 10^2...  << 

    for (int i = 0; i <= 20; i++) {
        num1 = num1 + 2;
        System.out.println(num1 * num1);
    }
}
}