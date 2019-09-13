package solution;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Immutable {

//  public static void main(String[] args) {
//    Immutable immutable = new Immutable(new ArrayList<String>(), new ArrayList<Date>(), new int[2]);
//    immutable.getStrings().add("some");
//  }

  private final List<String> strings;
  private final List<Date> dates;
  private final int[] integers;

  public Immutable(List<String> strings, List<Date> dates, int[] integers) {

    this.strings = Collections.unmodifiableList(strings);

    this.dates = new ArrayList<>(dates);

    this.integers = Arrays.copyOf(integers, integers.length);
  }

  public List<String> getStrings() {
    return strings;
  }


  public List<LocalDate> getDates() {
    return dates.stream()
        .map(Date::toInstant)
        .map(instant -> instant.atZone(ZoneId.systemDefault()).toLocalDate())
        .collect(
            Collectors.toList());
  }


  public int[] getIntegers() {
    return Arrays.copyOf(integers, integers.length);
  }
}
