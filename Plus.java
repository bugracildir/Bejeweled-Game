import java.util.ArrayList;

public class Plus extends Jewels {
    public Plus(int y, int x){
        super("+", 20, x, y);
    }
    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint,Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint][columnNumberOfPoint-1].getName()) && mathematicalSymbols.contains(gameGridList[rowNumberOfPoint][columnNumberOfPoint-2].getName())) {

                    MatchingJewels.throughLeftMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint][columnNumberOfPoint+1].getName()) && mathematicalSymbols.contains(gameGridList[rowNumberOfPoint][columnNumberOfPoint+2].getName())) {

                    MatchingJewels.throughRightMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-1][columnNumberOfPoint].getName()) && mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint].getName())) {

                    MatchingJewels.throughUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+1][columnNumberOfPoint].getName()) && mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint].getName())) {

                    MatchingJewels.throughDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
        }
    }
}
