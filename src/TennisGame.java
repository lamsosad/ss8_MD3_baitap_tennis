public class TennisGame {

    public static final String SUBTRACTION = "-";

    public static String getScore(String playerName1, String playerName2, int mScore1, int mScore2) {
        String score = "";
        int tempScore = 0;
        boolean condition = mScore1 == mScore2;
        score = getString(mScore1, mScore2, score, condition);
        return score;
    }

    public static String getString(int mScore1, int mScore2, String score, boolean condition) {
        int tempScore;
        if (condition) {
            switch (mScore1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else {
            boolean isScore1 = mScore1 >= 4;
            boolean isScore2 = mScore2 >= 4;
            if (isScore1 || isScore2) {
                int minusResult = getMinusResult(mScore1, mScore2);
                if (minusResult == 1)
                    score = "Advantage player1";
                else if (minusResult == -1)
                    score = "Advantage player2";
                else if (minusResult >= 2)
                    score = "Win for player1";
                else
                    score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1)
                        tempScore = mScore1;
                    else {
                        score = SUBTRACTION;
                        tempScore = mScore2;
                    }
                    switch (tempScore) {
                        case 0:
                            score = "Love";
                            break;
                        case 1:
                            score = "Fifteen";
                            break;
                        case 2:
                            score = "Thirty";
                            break;
                        case 3:
                            score = "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }

    private static int getMinusResult(int mScore1, int mScore2) {
        int minusResult = mScore1 - mScore2;
        return minusResult;
    }
}
