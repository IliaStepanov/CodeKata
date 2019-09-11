public class FizzBuzz {

  public static String check(int i) {

    StringBuilder builder = new StringBuilder();

    if (i % 3 == 0) {
      builder.append("fizz");
    }

    if (i % 5 == 0) {
      builder.append("buzz");
    }

    String result = builder.toString();
    return result.equals("") ? String.valueOf(i) : result;
  }
}
