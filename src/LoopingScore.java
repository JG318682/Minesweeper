public class LoopingScore
{
    public static void loopingScore()
    {

        for (int i = 0; i < 12; i++){
            System.out.println(Score.readString());
        }
        Score.saveAndClose();
        System.out.println();

        String scoreInfo = Score.readString();
        while (scoreInfo != null) {
            System.out.println(Cell.score);
            scoreInfo = Score.readString();
        }
        }
    }