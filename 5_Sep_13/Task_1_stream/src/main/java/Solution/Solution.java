package Solution;

import data.Data;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Solution {

  public static void main(String[] args) {

    List<Data> someData = Data.getData();

    LocalDate result1 = someData.stream()
        .map(Data::getDate)
        .filter(Objects::nonNull)
        .min(LocalDate::compareTo).get();

    LocalDate result2 = someData.stream()
        .map(Data::getDate)
        .min(Comparator.nullsLast(LocalDate::compareTo)).get();

    LocalDate result3 = someData.stream()
        .filter(data -> data.getDate() != null)
        .sorted((data1, data2) -> data1.getDate().compareTo(data2.getDate()))
        .findFirst().get().getDate();

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }

}
