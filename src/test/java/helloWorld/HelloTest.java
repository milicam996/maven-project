package helloWorld;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloTest {

    private Hello hello = new Hello();

    @Test
    public void helloSaysHello() {
        assertThat(hello.sayHello(), containsString("Hello"));
    }
}
