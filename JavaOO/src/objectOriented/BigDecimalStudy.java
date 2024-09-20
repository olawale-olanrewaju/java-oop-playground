package objectOriented;

import java.math.BigDecimal;

public class BigDecimalStudy {

    public static void main(String[] args) {

//        BigDecimal x = BigDecimal.valueOf(0.1);
        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = BigDecimal.valueOf(0.3);

        System.out.println(x.add(y));
    }
}
