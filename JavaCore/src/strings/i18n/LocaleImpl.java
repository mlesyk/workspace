package strings.i18n;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Maks on 16.07.2017.
 */
public class LocaleImpl {
    public static void main(String[] args) throws ParseException {
//        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        Locale current = new Locale.Builder().setLocale(Locale.GERMAN).build();
        ResourceManager manager = ResourceManager.INSTANCE;
//        manager.changeResource(Locale.GERMAN);
//        System.out.println(current.toString());
//        System.out.println(current.getCountry());
//        System.out.println(current.getDisplayCountry());
//        System.out.println(current.getDisplayLanguage());
//        System.out.println(current.getDisplayName());
//        System.out.println(current.getDisplayScript());
//        System.out.println(current.getDisplayVariant());
//        System.out.println(current.getExtension('a'));
//        System.out.println(current.getExtensionKeys());
//        System.out.println(current.getISO3Language());
//        System.out.println(current.getISO3Country());
        manager.changeResource(new Locale("uk", "UA"));
        System.out.println(manager.getString("message.hello_world"));
        System.out.println(manager.getString("message.introduce"));

        manager.changeResource(new Locale("ru", "RU"));
        System.out.println(manager.getString("message.hello_world"));
        System.out.println(manager.getString("message.introduce"));

        manager.changeResource(new Locale("en", "US"));
        System.out.println(manager.getString("message.hello_world"));
        System.out.println(manager.getString("message.introduce"));

    }
}
