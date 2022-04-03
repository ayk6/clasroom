package day32;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDate1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // objenin oluşturulduğu tarihi atar

        LocalDate date2 = LocalDate.of(1993,5,11);
        // istediğimiz tarihi girebiliriz

        System.out.println(date);
        System.out.println(date.getDayOfMonth()); // ayın hangi günü olduğunu verir
        System.out.println(date.getDayOfWeek()); // haftanın hangi günü yazdırır
        System.out.println(date.getDayOfYear()); // yılın kaçıncı günü

        // tarihten ileri ya da geri gidilebilir
        System.out.println(date.minusDays(10));
        System.out.println(date.minusWeeks(5).minusDays(3));
        System.out.println(date.plusDays(7));

        LocalDate dtZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(dtZone); // belirtilen konumdaki tarihi verir

        // is ile başlayanlar boolean sonuç verir
        System.out.println(LocalDate.now().isLeapYear());
        // artık yıl mı true or false verir
        System.out.println(date.isAfter(date2));

    }
}
