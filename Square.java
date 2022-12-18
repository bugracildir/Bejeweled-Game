import java.util.ArrayList;

public class Square extends Jewels {
    public Square(int y, int x){
        super("S", 15, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((gameGridList[rowNumberOfPoint][columnNumberOfPoint-1].getName().equals("S")) && (gameGridList[rowNumberOfPoint][columnNumberOfPoint - 2].getName().equals("S"))) {

                    MatchingJewels.throughLeftMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+45);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint][columnNumberOfPoint + 1].getName().equals("S")) && (gameGridList[rowNumberOfPoint][columnNumberOfPoint+2].getName().equals("S"))) {

                    MatchingJewels.throughRightMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+45);

                    break;
                }
            }
            catch (Exception e){}
        }
    }
}
