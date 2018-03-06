package strings.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Maks on 16.07.2017.
 */
public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    // Use custom UTF8Control for UTF-8 encoding in resources
    private ResourceBundle.Control control = new UTF8Control();
    private final String resourceName = "resource.bundle.text";
    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault(), control);
    }

    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourceName,locale, control);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
