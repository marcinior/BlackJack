package blackjack;

import java.util.ArrayList;

public class MyUtil {

    public static void swap(int i, int j, ArrayList<Card> list) {
        Card temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
