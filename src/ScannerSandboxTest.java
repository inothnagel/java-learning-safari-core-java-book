import com.sun.tools.javac.util.List;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ScannerSandboxTest {

    @Test
    public void test1() {
        String input = "foo bar baz bazooka";
        List<String> targetWords = List.of("foo", "bar", "baz", "bazooka");

        Scanner scanner = new Scanner(input);

        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        assertThat(words, is(targetWords));
    }
}