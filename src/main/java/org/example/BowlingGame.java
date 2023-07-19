package org.example;

public class BowlingGame implements Game{

    private int[] hits = new int[21];
    private int i;
    @Override
    public void roll(int pins) {
       hits[i++] = pins;
    }

    @Override
    public int score() {
        int score = 0;
        int roll = 0;
        for (int frame = 0; frame < 10; frame++) {
            int frameScore = 0;
            if (hits[roll] == 10) {
                frameScore = 10 + hits[roll + 1] + hits[roll + 2];
                roll++;
            } else if ((hits[roll] + hits[roll + 1]) == 10) {
                frameScore = 10 + hits[roll + 2];
                roll = roll + 2;
            } else {
                frameScore = hits[roll] + hits[roll + 1];
                roll = roll + 2;
            }
            score += frameScore;
        }
        return score;
    }
}
