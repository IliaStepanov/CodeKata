package solution;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Immutable {

  private final List<String> strings;
  private final List<Date> dates;
  private final int[] integers;

  public Immutable(List<String> strings, List<Date> dates, int[] integers) {

    this.strings = new ArrayList<>(strings);

    this.dates = new ArrayList<>(dates);

    this.integers = Arrays.copyOf(integers, integers.length);
  }

  public List<String> getStrings() {
    return new ArrayList<>(strings);
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
