package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {


  private String string;
  private LocalDate date;


  public static List<Data> getData() {
    List<Data> someData = new ArrayList<Data>() {{

      add(new Data("a", LocalDate.of(1990, 5, 11)));
      add(new Data("b", LocalDate.of(1988, 7, 1)));
      add(new Data("g", LocalDate.of(1978, 7, 5)));
      add(new Data("c", null));
      add(new Data("d", LocalDate.of(1945, 11, 22)));
      add(new Data("d", LocalDate.of(1955, 1, 12)));
      add(new Data("d", LocalDate.of(1445, 4, 16)));
      add(new Data("d", LocalDate.of(1915, 5, 29)));
      add(new Data("d", LocalDate.of(1145, 12, 4)));

    }};
    return someData;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("string='").append(string).append('\'');
    sb.append(", date=").append(date);
    sb.append('}');
    return sb.toString();
  }

  public Data(String string, LocalDate date) {
    this.string = string;
    this.date = date;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}