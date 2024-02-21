package warmup;

import interfaces.WarmupInterfaces;
import warmupSolutions.WarmupSolutions;

public class Warmup {
    public static WarmupInterfaces warmupTest1;
    private static Boolean sleepIn, weekday = false, vacation = false;

    public static void main(String[] args) {
        warmupTest1 = new WarmupSolutions();
        for (int i = 0; i < 3; ++i) {
            sleepIn = warmupTest1.sleepIn(weekday, vacation);
            System.out.printf("It is a weekday: %s and vacation: %s for me, sleep in is %s\n", weekday, vacation, sleepIn);
            if (i == 0) {
                weekday = true;
                vacation = false;
            } else {
                weekday = false;
                vacation = true;
            }
        }
        System.out.printf("Sum of 1 and 2 is %s\n", warmupTest1.sumDouble(1, 2));
        System.out.printf("Sum of 3 and 2 is %s\n", warmupTest1.sumDouble(3, 2));
        System.out.printf("Double of 2 and 2 is %s\n", warmupTest1.sumDouble(2, 2));

        System.out.printf("'Not' amended to candy: %s\n", warmupTest1.amendString("candy"));
        System.out.printf("'Not' amended to X: %s\n", warmupTest1.amendString("X"));
        System.out.printf("No amend to 'not bad', remains as: %s\n", warmupTest1.amendString("not bad"));

        String name = "Malayalam";
        for (int i = 0; i < name.length() - 1; ++i) {
            System.out.printf("Stripped String: %s\n", warmupTest1.removeFromString(name, i));
        }
    }
}
