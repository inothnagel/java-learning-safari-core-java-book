public class Strings {
    private static final int ITERATIONS = 1000;

    public static void main(String[] args) {
        String foo = "\uD835\uDD46 is the set of octonions";
        System.out.println(foo);

        timeStrings();

    }

    public static void timeStrings() {
        long start1 = System.nanoTime();
        buildStringWithConcatenation();
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;

        long start2 = System.nanoTime();
        buildStringWithStringBuilder();
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;

        long largest = Math.max(duration1, duration2);
        long smallest = Math.min(duration1, duration2);
        long factor = largest / smallest;

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(factor + " times faster");
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
