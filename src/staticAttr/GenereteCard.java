/*package staticAttr;

import java.util.ArrayList;

public class GenereteCard {
    private ArrayList card = new ArrayList();


    public static String generateRandomCard() {
        String cardAdd = "";
        int nextNumber = (int) Math.random();
        boolean gencard = true;
        while (true) {
            if (cardAdd.length() == 0) {
                if (nextNumber > 0) {
                    cardAdd = Integer.toString(nextNumber);
                } else {
                    nextNumber = (int) Math.random();
                }
            } else {
                cardAdd += nextNumber;
                if (cardAdd.length() == 16) gencard = false;
            }
        }
    }

    public static String getCard() {
        return generateRandomCard();
    }

    public void setCard(ArrayList card) {
        this.card = card;
    }
}
*/