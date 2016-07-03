/**
 * Created by inothnagel on 2016/07/03.
 */
public enum Enum {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    public static void main(String[] args) {
        Enum foo = Enum.EXTRA_LARGE;
        if (foo == Enum.EXTRA_LARGE) {
            System.out.println("true");
        }
    }
}
