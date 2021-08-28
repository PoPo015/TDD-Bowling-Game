public class Game {

    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int inps) {
        rolls[currentRoll++] = inps;
    }

    public int getscore() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            //space
            if(isStrike(rolls[frameIndex])){ //스트라이크
                score += 10 + rolls[frameIndex +1] + rolls[frameIndex+2];
                frameIndex++;
            }
            else if(isSpare(frameIndex)) {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            }else{
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int frameIndex) {
        return frameIndex == 10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}
