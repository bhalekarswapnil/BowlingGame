package org.example;

public class BowlingGame implements Game{

    private int[] hits = new int[21];
    private int i;
    @Override
    public void roll(int pins) {
       hits[++i] = pins;
    }

    @Override
    public int score() {
        int score = 0;

        for(int i=1;i<21;i++){
            score+=hits[i];
        }
        return score;
    }
}
