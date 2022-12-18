import java.util.ArrayList;

public class Slash extends Jewels{
    public Slash(int y, int x){
        super("/", 20, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-1][columnNumberOfPoint+1].getName())) && (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint+2].getName()))) {

                    MatchingJewels.throughRightUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+1][columnNumberOfPoint-1].getName())) && (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint-2].getName()))) {

                    MatchingJewels.throughLeftDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e) {}
        }
    }
}
