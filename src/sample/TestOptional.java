package sample;

import java.util.Locale;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional.of("22").filter(d ->d.length() >1).ifPresent(s ->System.out.println("sss"));

        boolean c = Optional.ofNullable("mm").orElse("").equals("mm");
        System.out.println(c);

        String s2 = Optional.ofNullable(null).orElse("").toString().toLowerCase();
        System.out.println(s2+"dd");
        Optional.of("22").filter(d ->d.length() >1).filter(d ->d.length() ==2).ifPresent(s -> System.out.println("dd")
        );
    }


}
