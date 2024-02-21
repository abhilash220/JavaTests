package interfaces;

public interface WarmupInterfaces {
    /**
     * This method is used to check if I can sleep in or work
     */
    boolean sleepIn(Boolean weekday, Boolean vacation);

    /**
     * Method to do an arithmetic
     */
    int sumDouble(int a, int b);

    /**
     * Method to do a string swap
     */
    String amendString(String amend);

    /**
     * Method to remove a character in string at a specific index
     */
    String removeFromString(String remove, int i);
}
