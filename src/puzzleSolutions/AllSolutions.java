package puzzleSolutions;

import interfaces.PuzzleInterface;

public class AllSolutions implements PuzzleInterface {
    /**
     * Implementation of the interface method for swapping two variables using a third variable
     * */
    @Override
    public void swapVariableMethod() {
        int x = 10;
        int y = 20;
        int z = 0;
        System.out.print("Values of x and y variables before swap\n");
        System.out.println("x: "+x+", y: "+y);
        z = x;
        x = y;
        y = z;
        System.out.print("Values of x and y variables after swap using a third variable\n");
        System.out.println("x: " +x+ ", y: "+y + "\n");
    }

    /**
     *Implementation of the interface method for swapping two variables without using a third variable
     */
    @Override
    public void swapNoVariableMethod() {
        int x = 10;
        int y = 20;
        System.out.print("Values of x and y variables before swap\n");
        System.out.println("x: "+x+", y: "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.print("Values of x and y variables after swap without a third variable\n");
        System.out.println("x: "+x+", y: "+y + "\n");
    }
}
