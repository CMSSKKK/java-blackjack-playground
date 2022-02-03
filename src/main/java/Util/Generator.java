package Util;

import java.util.Random;

public class Generator {

    public static Random random = new Random();

    public static int GenerateKindRandom() {
        return random.nextInt(12);
    }
    public static int GenerateSuitRandom() {
        return random.nextInt(4);
    }
}
