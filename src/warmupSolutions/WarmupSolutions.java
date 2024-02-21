package warmupSolutions;

import interfaces.WarmupInterfaces;

public class WarmupSolutions implements WarmupInterfaces {
    /**
     * @param weekday  takes values true or false
     * @param vacation takes values true or false
     * @return (false, false) → true, (true, false) → false, (false, true) → true for weekday and vacation values respectively
     */
    @Override
    public boolean sleepIn(Boolean weekday, Boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        }
        return true;
    }

    /**
     * @param a takes values 1,3 and 2
     * @param b takes values 2, 2 and 2
     * @return will return sum or double
     */
    @Override
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * a;
        } else
            return a + b;
    }

    /**
     * Given a string,
     * return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.
     */
    @Override
    public String amendString(String name) {
        if (name.startsWith("not")) {
            return name;
        }
        return "not " + name;
    }

    /**
     * Method to remove a character in string at a specific index
     * Index value is the same as the lenght of the string
     */
    public String removeFromString(String name, int i) {
        String first = name.substring(0, i);
        String last = name.substring(i + 1, name.length());
        if (i == 0) {
            return last;
        }
        return first + last;
    }
}
