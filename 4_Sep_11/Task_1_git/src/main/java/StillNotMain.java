import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class StillNotMain {

  public static void main(String[] args) {

    Date date = new Date(119, Calendar.DECEMBER,1);

    System.out.println(date);

    System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
  }

}
