package solution;

import java.util.Date;
import java.util.List;

public class Immutable {

  public List<String> strings;
  public List<Date> dates;
  public List<Integer> integers;



  public List<String> getStrings() {
    return strings;
  }

  public void setStrings(List<String> strings) {
    this.strings = strings;
  }

  public List<Date> getDates() {
    return dates;
  }

  public void setDates(List<Date> dates) {
    this.dates = dates;
  }

  public List<Integer> getIntegers() {
    return integers;
  }

  public void setIntegers(List<Integer> integers) {
    this.integers = integers;
  }

}
