package kyu5;
/*
DESCRIPTION:
Your task is to return the list with elements from tree sorted by levels,
which means the root element goes first, then root children (from left to right)
are second and third, and so on.

Return empty list if root is 'null'.

Example 1 - following tree:

                 2
            8        9
          1  3     4   5
Should return following list:

[2,8,9,1,3,4,5]
*/
import java.util.*;

class Kata {
    public static List<Integer> treeByLevels(Node node) {
        if (node==null)
            return Collections.emptyList();
        Queue<Node> queue = new LinkedList<Node>();
        List<Integer> values = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            values.add(temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return values;
    }
}
