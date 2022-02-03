package domain;

import java.util.Objects;

public class Card {

    private Suit suit;
    private Kind kind;

    public Card(Suit suit, Kind kind) {
        this.suit = suit;
        this.kind = kind;
    }

    public Kind getKind() {
        return kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && kind == card.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, kind);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", kind=" + kind +
                '}';
    }
}
