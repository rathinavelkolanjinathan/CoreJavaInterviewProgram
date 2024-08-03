package Collection;

import java.util.EnumSet;

public class GFG {
    // Enum
    enum Game { CRICKET, HOCKEY, TENNIS }

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an EnumSet using allOf()
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        // Printing EnumSet elements to the console
        System.out.println("EnumSet: " + games);
    }
}
