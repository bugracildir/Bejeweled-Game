import java.util.ArrayList;

public class Diamond extends Jewels{
    public Diamond(int y, int x){
        super("D", 30, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((gameGridList[rowNumberOfPoint - 1][columnNumberOfPoint - 1].getName().equals("D")) && (gameGridList[rowNumberOfPoint - 2][columnNumberOfPoint - 2].getName().equals("D"))) {

                    MatchingJewels.throughLeftUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+90);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint + 1][columnNumberOfPoint + 1].getName().equals("D")) && (gameGridList[rowNumberOfPoint + 2][columnNumberOfPoint + 2].getName().equals("D"))) {

                    MatchingJewels.throughRightDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+90);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint - 1][columnNumberOfPoint + 1].getName().equals("D")) && (gameGridList[rowNumberOfPoint - 2][columnNumberOfPoint + 2].getName().equals("D"))) {

                    MatchingJewels.throughRightUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+90);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint + 1][columnNumberOfPoint - 1].getName().equals("D")) && (gameGridList[rowNumberOfPoint + 2][columnNumberOfPoint - 2].getName().equals("D"))) {

                    MatchingJewels.throughLeftDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+90);

                    break;
                }
            }
             catch (Exception e) {}
        }
    }
}
