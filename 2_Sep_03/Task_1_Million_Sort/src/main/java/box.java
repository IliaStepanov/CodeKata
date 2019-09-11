import java.util.stream.IntStream;

public class box {

  public static void main(String[] args) {
    IntStream.iterate(0, i -> ++i).limit(10).mapToObj(i -> i + " ").forEach(System.out::print);

    

  }


}