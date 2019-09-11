import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void test() {


    assertEquals("fizz",FizzBuzz.check(3));
    assertEquals("buzz",FizzBuzz.check(5));
    assertEquals("fizz",FizzBuzz.check(6));
    assertEquals("buzz",FizzBuzz.check(10));
    assertEquals("fizzbuzz",FizzBuzz.check(15));
    assertEquals("1",FizzBuzz.check(1));
    assertEquals("19",FizzBuzz.check(19));
  }


}
