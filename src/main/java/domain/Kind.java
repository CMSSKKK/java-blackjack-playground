package domain;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public enum Kind {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    JACK(10),
    QUEEN(10),
    KING(10);

    private static final EnumSet<Kind> kinds = EnumSet.allOf(Kind.class);
    private static final List<Kind> kindList = Arrays.stream(values()).collect(Collectors.toList());

    private final int score;

    Kind(final int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public static Kind getKind(int n) {
        return kindList.get(n);
    }

}
