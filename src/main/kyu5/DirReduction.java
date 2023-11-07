package kyu5;

/*
DESCRIPTION:
        Once upon a time, on a way through the old wild mountainous west,…
        … a man was given directions to go from one point to another. The directions were "NORTH",
         "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.

        Going to one direction and coming back the opposite direction right away is a
        needless effort. Since this is the wild west, with dreadful weather and not much water,
        it's important to save yourself some energy, otherwise you might die of thirst!

        How I crossed a mountainous desert the smart way.
        The directions given to the man are, for example, the following (depending on the language):
*/

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        String path = String.join(";", arr) +";";
        String[] directions = {"NORTH;SOUTH;", "SOUTH;NORTH;", "WEST;EAST;", "EAST;WEST;"};
        boolean pathIsNotOptimal = path.contains(directions[0]) || path.contains(directions[1]) ||
                path.contains(directions[2])  || path.contains(directions[3]);
        while (pathIsNotOptimal){
            for (int i = 0; i < 4; i++) {
                if (path.contains(directions[i]))
                    path=path.replace(directions[i],"");
            }
            pathIsNotOptimal = path.contains(directions[0]) || path.contains(directions[1])
                    || path.contains(directions[2]) || path.contains(directions[3]);
        }
        if (path.trim().isEmpty()) return new String[0];
        return path.split(";");
    }
}
