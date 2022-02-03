package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Suit {
    CLUB,HEART,DIAMOND,SPADE;

    private static final List<Suit> suits = Arrays.stream(values()).collect(Collectors.toList());

    public static Suit getSuit(int n) {
        return suits.get(n);
    }
}
