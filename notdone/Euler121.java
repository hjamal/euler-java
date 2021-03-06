import java.util.Date;
/*
Project Euler Problem 121
=========================

A bag contains one red disc and one blue disc. In a game of chance a
player takes a disc at random and its colour is noted. After each turn the
disc is returned to the bag, an extra red disc is added, and another disc
is taken at random.

The player pays -L-1 to play and wins if they have taken more blue discs
than red discs at the end of the game.

If the game is played for four turns, the probability of a player winning
is exactly 11/120, and so the maximum prize fund the banker should
allocate for winning in this game would be -L-10 before they would expect
to incur a loss. Note that any payout will be a whole number of pounds and
also includes the original -L-1 paid to play the game, so in the example
given the player actually wins -L-9.

Find the maximum prize fund that should be allocated to a single game in
which fifteen turns are played.
*/

public class Euler121 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
