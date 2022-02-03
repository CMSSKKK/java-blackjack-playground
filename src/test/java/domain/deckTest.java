package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class deckTest {

    @Test
    void peekCardTest() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Deck.pickCard());
        }
//        Card card = Deck.pickCard();
//        Card card1 = Deck.pickCard();
//        System.out.println(card.toString());
//        System.out.println(card1.toString());
//        Assertions.assertThat(card.equals(card1)).isFalse();
    }
}
