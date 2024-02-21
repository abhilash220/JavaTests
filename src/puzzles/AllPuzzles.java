package puzzles;

import interfaces.PuzzleInterface;
import puzzleSolutions.AllSolutions;

public class AllPuzzles {
    public static PuzzleInterface puzzle;
    public static void main(String[] args) throws Exception {
        //Calling the method in interface for swapping variables using a 3rd variable
        puzzle = new AllSolutions();
        puzzle.swapVariableMethod();
        puzzle.swapNoVariableMethod();
    }
}


