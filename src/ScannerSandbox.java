import java.util.Scanner;

public class ScannerSandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println(word1 + "," + word2);
        String word3 = scanner.next();
        System.out.println(word3);
        int int1 = scanner.nextInt();
        System.out.println(int1);
    }
}
