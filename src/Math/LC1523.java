package Math;

public class LC1523 {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}

//Given two non-negative integers low and high.
// Return the count of odd numbers between low and high (inclusive).