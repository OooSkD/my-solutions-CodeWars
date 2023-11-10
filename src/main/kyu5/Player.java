package kyu5;

/*
Don't Eat the Last Cake!
DESCRIPTION:
In a room is a table with a pile of cakes. One of these cakes is poisoned. Every turn,
we will take cakes from this pile and eat them, leaving the last one to be the poisoned cake.
Whoever eats the poisoned cake will die. The poisoned cake is clearly marked, so you do not have to
guess. Rather you need to rely on logic to save you.

The rules are simple:
    Do not eat the last cake. It's obivious that the poisoned cake will be the last to be eaten, so,
    DON'T EAT THE LAST CAKE. Try to make your opponent eat it.

    When it is your turn, you can only take one, two or three cakes. The same rules apply to your opponent
    on their turn. You cannot skip your move, so choose wisely how many cakes to eat.
    Both opponents will be able to see how many cakes the other eats on each turn.

    You cannot copy your opponent's previous move; likewise they cannot copy yours. If your opponent
    takes one cake, next move you can only choose between two and three. If you take three cakes,
    your opponent can only choose one or two. This doesn't effect the first move, only subsequent ones.

    If one of the players has no valid moves (ie. one cake left and previous move was one cake),
    that player will skip their turn. Then the other player will be forced to eat the last cake.
    This is the ONLY case of turn skipping.

    You can choose whether or not to go first. This decision is key to victory, so don't hurry, choose wisely!
 */
public class Player {
    public Player(int cakes) {
    }

    // Decide who move first - player or opponent (true if player)
    public boolean firstMove(int cakes) {
        // I wish to move first
        return cakes > 2 && cakes % 4 != 2;
    }

    public int move(int cakes, int last) {
        if (cakes % 4 < 3)
            return 3;
        else return 1;
    }
}
