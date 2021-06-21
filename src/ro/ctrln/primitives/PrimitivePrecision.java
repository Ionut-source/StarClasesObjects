package ro.ctrln.primitives;

import java.math.BigDecimal;

public class PrimitivePrecision {

    public static void main(String[] args) {

        float f1 = 1;
        float f2 = 0.4F;

        System.out.println(f1 - 2*f2 ); // 1 - 2*0.4; 1 - 0.8; 0.2;

        double d1 = 2;
        double d2 = 0.3;

        System.out.println(d1/2 - d2*2.33); // 2/2 - 0.3*2.33; 1 - 0.699; 0.301;

        BigDecimal bd1 = BigDecimal.valueOf(f1);
        BigDecimal bd2 = BigDecimal.valueOf(f2);

        System.out.println(bd1.subtract(BigDecimal.valueOf(2).multiply(bd2)));

        BigDecimal bd3 = BigDecimal.valueOf(d1);
        BigDecimal bd4 = BigDecimal.valueOf(d2);

        System.out.println(bd3.divide(BigDecimal.valueOf(2)).subtract(bd4.multiply(BigDecimal.valueOf(2.33))));
        }
    }

