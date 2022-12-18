import java.util.ArrayList;

public class BackSlash extends Jewels {
    public BackSlash(int y, int x){
        super("\\", 20, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-1][columnNumberOfPoint-1].getName())) && (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint-2].getName()))) {

                    MatchingJewels.throughLeftUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+1][columnNumberOfPoint+1].getName())) && (mathematicalSymbols.contains(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint+2].getName()))) {

                    MatchingJewels.throughRightDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+60);

                    break;
                }
            }
            catch (Exception e){}
        }
    }
}
