import java.util.ArrayList;

public class Triangle extends Jewels{
    public Triangle(int y, int x){
        super("T", 15, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((gameGridList[rowNumberOfPoint-1][columnNumberOfPoint].getName().equals("T")) && (gameGridList[rowNumberOfPoint-2][columnNumberOfPoint].getName().equals("T"))) {

                    MatchingJewels.throughUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+45);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint+1][columnNumberOfPoint ].getName().equals("T")) && (gameGridList[rowNumberOfPoint + 2][columnNumberOfPoint].getName().equals("T"))) {

                    MatchingJewels.throughDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+45);

                    break;
                }
            }
            catch (Exception e){}
        }
    }
}
