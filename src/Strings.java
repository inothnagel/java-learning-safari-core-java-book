import java.util.function.Function;

public class Strings {
    private static final int ITERATIONS = 1000;

    public static void main(String[] args) {
        String foo = "\uD835\uDD46 is the set of octonions";
        System.out.println(foo);

        timeStrings();

    }

    public static void timeStrings() {
        long duration1 = time((x) -> buildStringWithConcatenation());
        long duration2 = time((x) -> buildStringWithStringBuilder());

        long largest = Math.max(duration1, duration2);
        long smallest = Math.min(duration1, duration2);
        long factor = largest / smallest;

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(factor + " times faster");
    }

    private static long time(Function f) {
        long start = System.nanoTime();
        f.apply(null);
        long end = System.nanoTime();
        long duration = end - start;
        return duration;
    }

    private static String buildStringWithStringBuilder() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            b.append(i);
        }
        return b.toString();
    }

    private static String buildStringWithConcatenation() {
        String s = "";
        for (int i = 0; i < ITERATIONS; i++) {
            s+= i;
        }
        return s;
    }
}
