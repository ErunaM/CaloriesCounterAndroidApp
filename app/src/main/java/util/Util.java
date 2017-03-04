package util;

import java.text.DecimalFormat;

/**
 * Created by Dee on 3/03/2017.
 */

public class Util { // static method that formats our numbers 1000 = 1,000

    public static String formatNumber(int value)
    {
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formatted = formatter.format(value);

        return formatted;
    }


}
