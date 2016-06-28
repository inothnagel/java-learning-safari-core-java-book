/**
 * Created by inothnagel on 2016/06/27.
 */
public class FloorMod {
    public static void main(String[] args) {
        m(10, 4);
        fm(10, 4);
        m(-10, 4);
        fm(-10,4);

        m(-20,12);
        fm(20,12);
        fm(-20,12);

        fd(20, 12);
        fd(-20, 12);
    }

    public static void p(String s) {
        System.out.println(s);
    }

    public static void m(int a, int b) {
        p("Mod(" + a + ", " + b + ") == " + a % b);
    }

    public static void fm(int a, int b) {
        p("FloorMod(" + a + ", " + b + ") == " + Math.floorMod(a, b));
    }

    public static void fd(int a, int b){
        p("FloorDiv(" + a + ", " + b + ") == " + Math.floorDiv(a, b));
    }

}
