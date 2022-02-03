package domain;

import Util.Generator;

import java.util.HashSet;
import java.util.Set;

public class Deck {

    private static final Set<Card> OutOfDeck = new HashSet<>();


    public static Card pickCard() {
        Card card = new Card(Suit.getSuit(Generator.GenerateSuitRandom()), Kind.getKind(Generator.GenerateKindRandom()));
        if(OutOfDeck.contains(card)) {
            card = pickCard();
        }
        OutOfDeck.add(card);
        return card;
    }

}
