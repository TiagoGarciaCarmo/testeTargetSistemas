public class EX_04_D {
public static void main(String[] args) {
    int num1 = 4;
    int diferença = 12;
    System.out.println(num1);

    // 4 16 36 64 100
    //  12  20  28 36  diferença + 8  << 

    for (int i = 0; i <= 20; i++) {
        num1 = num1 + diferença;
        System.out.println(num1);
        diferença = diferença + 8;
    }
}
}