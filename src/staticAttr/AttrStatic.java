package staticAttr;

import java.util.ArrayList;

public class AttrStatic {
    private static final String[] ABBREVIATIONS = new String[]{"UAH", "USD", "EUR"};

    /**
     * Получение массива допустимых абревиатур
     *
     * @return abbreviations massiv
     */
    public static String[] getABBREVIATIONS() {
        return ABBREVIATIONS;
    }

    private static final ArrayList<String> listCard = new ArrayList<>();
}
