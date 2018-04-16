package blackjack;

import java.util.Random;
import java.util.ArrayList;
import static blackjack.MyUtil.swap;

public class Deck {

    private ArrayList<Card> deck;
    public int countOfDistributedCards;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int value = 2; value < 15; value++) {
            for (int suit = 1; suit <= 4; suit++) {
                deck.add(new Card(value, suit));
            }
        }
        countOfDistributedCards = 0;
    }

    public void addCardToDeck(Card card) {
        if (card != null) {
            deck.add(card);
            countOfDistributedCards--;
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 51; i > 0; i--) {
            int rand = random.nextInt(i);
            swap(i, rand, deck);
        }
    }

    public Card distributeCard() {
        if (countOfDistributedCards == 52) {
            shuffle();
        }
        countOfDistributedCards++;
        return deck.get(countOfDistributedCards - 1);
    }

    public void removeFromDeck(int cardToRemoveNumber) {
        deck.remove(cardToRemoveNumber);
    }

    public int cardInDeck() {
        return 52 - countOfDistributedCards;
    }
}
