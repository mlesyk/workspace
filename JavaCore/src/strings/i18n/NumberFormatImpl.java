package strings.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Maks on 17.07.2017.
 */
public class NumberFormatImpl {

    public static void main(String[] args) throws ParseException {
        ResourceManager manager = ResourceManager.INSTANCE;
        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfUa = NumberFormat.getInstance(new Locale("uk","UA"));

        manager.changeResource(Locale.GERMAN);
        double numGE = nfGe.parse(manager.getString("number.test")).doubleValue();
        System.out.println(nfUs.format(numGE));
        System.out.println(nfUa.format(numGE));
        manager.changeResource(Locale.US);
        double numUS = nfUs.parse(manager.getString("number.test")).doubleValue();
        manager.changeResource(new Locale("uk","UA"));
        double numUA = nfUa.parse(manager.getString("number.test")).doubleValue();
        System.out.printf("GE= %f\n US= %f\n UA= %f" , numGE, numUS, numUA);
    }
}
