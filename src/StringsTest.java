import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by inothnagel on 2016/07/03.
 */
public class StringsTest {

    @Test
    public void foo() {
        assertThat("\uD835\uDD46".length(), is(2));
        assertThat("hello".replace("ell", "azz"), is("hazzo"));

        assertThat("hello".startsWith("he"), is(true));
        assertThat("hello".startsWith("lo"), is(false));

        assertThat("hello".endsWith("lo"), is(true));
        assertThat("hello".endsWith("he"), is(false));

        assertThat("hello".substring(2,4), is("ll"));
    }

}