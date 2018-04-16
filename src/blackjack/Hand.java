package blackjack;

import java.util.ArrayList;
import static blackjack.MyUtil.swap;
import java.util.Collections;
import java.util.Comparator;

public class Hand {

    public ArrayList<Card> handK = new ArrayList<Card>();

    public void addCardToHand(Card card) {
        if (card != null) {
            handK.add(card);
        }
    }

    public void clearHand() {
        handK.clear();
    }

    public int cardInHand() {
        return handK.size();
    }

    public Card getCard(int position) {
        if (position >= 0 && position <= 4) {
            return handK.get(position);
        } else {
            return null;
        }
    }

    public int blackJackPoints() {
        int points = 0;
        int occurenceOfAce = 0;

        for (Card card : handK) {
            if (card.getValue() <= 10) {
                points += card.getValue();
            } else {
                if (card.getValue() > 10 && card.getValue() < 14) {
                    points += 10;
                } else {
                    if (card.getValue() == 14) {
                        occurenceOfAce++;
                    }
                }
            }
        }
        if (occurenceOfAce > 0) {
            for (int i = 0; i < occurenceOfAce; i++) {
                if (points + 11 <= 21) {
                    points += 11;
                } else {
                    points++;
                }
            }
        }
        return points;
    }

    public int blackJackPoints(int x) {
        int points;

        if (handK.get(0).getValue() <= 10) {
            points = handK.get(0).getValue();
        } else {
            if (handK.get(0).getValue() > 10 && handK.get(0).getValue() < 14) {
                points = 10;
            } else {
                points = 11;
            }
        }
        return points;
    }
}
