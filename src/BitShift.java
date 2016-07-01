import java.util.Scanner;

/**
 * Playing with bitmask
 * Use a scanning bitmask to read the bits of a given integer.
 */
public class BitShift {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            int mask = 1 << i;
            int targetBit = (n & mask) >> i;
            System.out.println("Bit number " + i + " of " + n + " is: " + targetBit);
        }
    }
}
