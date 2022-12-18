import java.util.ArrayList;

public class Wildcard extends Jewels{
    public Wildcard(int y, int x){
        super("W", 10, x, y);
    }

    @Override
    public void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer, ArrayList<String> mathematicalSymbols) {
        for (int a = 0;a<1;a++) {
            try {
                if ((gameGridList[rowNumberOfPoint-1][columnNumberOfPoint].getName().equals(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint].getName())) ||
                        (gameGridList[rowNumberOfPoint-1][columnNumberOfPoint ].getName().equals("W")) || (gameGridList[rowNumberOfPoint-2][columnNumberOfPoint].getName().equals("W"))) {

                    MatchingJewels.throughUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint-1][columnNumberOfPoint]
                            .getPoints()+gameGridList[rowNumberOfPoint-2][columnNumberOfPoint].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint+1][columnNumberOfPoint].getName().equals(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint].getName())) ||
                        (gameGridList[rowNumberOfPoint+1][columnNumberOfPoint ].getName().equals("W")) || (gameGridList[rowNumberOfPoint+2][columnNumberOfPoint].getName().equals("W"))) {

                    MatchingJewels.throughDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint+1][columnNumberOfPoint]
                            .getPoints()+gameGridList[rowNumberOfPoint+2][columnNumberOfPoint].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint][columnNumberOfPoint-1].getName().equals(gameGridList[rowNumberOfPoint][columnNumberOfPoint-2].getName())) ||
                        (gameGridList[rowNumberOfPoint][columnNumberOfPoint-1].getName().equals("W")) || (gameGridList[rowNumberOfPoint][columnNumberOfPoint-2].getName().equals("W"))) {

                    MatchingJewels.throughLeftMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint][columnNumberOfPoint-1]
                            .getPoints()+gameGridList[rowNumberOfPoint][columnNumberOfPoint-2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint][columnNumberOfPoint+1].getName().equals(gameGridList[rowNumberOfPoint][columnNumberOfPoint+2].getName())) ||
                        (gameGridList[rowNumberOfPoint][columnNumberOfPoint+1].getName().equals("W")) || (gameGridList[rowNumberOfPoint][columnNumberOfPoint+2].getName().equals("W"))) {

                    MatchingJewels.throughRightMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint][columnNumberOfPoint+1]
                            .getPoints()+gameGridList[rowNumberOfPoint][columnNumberOfPoint+2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint-1][columnNumberOfPoint-1].getName().equals(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint-2].getName())) ||
                        (gameGridList[rowNumberOfPoint-1][columnNumberOfPoint-1].getName().equals("W")) || (gameGridList[rowNumberOfPoint-2][columnNumberOfPoint-2].getName().equals("W"))) {

                    MatchingJewels.throughLeftUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint-1][columnNumberOfPoint-1]
                            .getPoints()+gameGridList[rowNumberOfPoint-2][columnNumberOfPoint-2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint+1][columnNumberOfPoint+1].getName().equals(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint+2].getName())) ||
                        (gameGridList[rowNumberOfPoint+1][columnNumberOfPoint+1].getName().equals("W")) || (gameGridList[rowNumberOfPoint+2][columnNumberOfPoint+2].getName().equals("W"))) {

                    MatchingJewels.throughRightDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint+1][columnNumberOfPoint+1]
                            .getPoints()+gameGridList[rowNumberOfPoint+2][columnNumberOfPoint+2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint-1][columnNumberOfPoint+1].getName().equals(gameGridList[rowNumberOfPoint-2][columnNumberOfPoint+2].getName())) ||
                        (gameGridList[rowNumberOfPoint-1][columnNumberOfPoint+1].getName().equals("W")) || (gameGridList[rowNumberOfPoint-2][columnNumberOfPoint+2].getName().equals("W"))) {

                    MatchingJewels.throughRightUpMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint-1][columnNumberOfPoint+1]
                            .getPoints()+gameGridList[rowNumberOfPoint-2][columnNumberOfPoint+2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
            try {
                if ((gameGridList[rowNumberOfPoint+1][columnNumberOfPoint-1].getName().equals(gameGridList[rowNumberOfPoint+2][columnNumberOfPoint-2].getName())) ||
                        (gameGridList[rowNumberOfPoint+1][columnNumberOfPoint-1].getName().equals("W")) || (gameGridList[rowNumberOfPoint+2][columnNumberOfPoint-2].getName().equals("W"))) {

                    MatchingJewels.throughLeftDownMatch(gameGridList, rowNumberOfPoint, columnNumberOfPoint);

                    currentPlayer.setPointOfPlayer(currentPlayer.getPointOfPlayer()+gameGridList[rowNumberOfPoint+1][columnNumberOfPoint-1]
                            .getPoints()+gameGridList[rowNumberOfPoint+2][columnNumberOfPoint-2].getPoints()+10);

                    break;
                }
            }
            catch (Exception e){}
        }
    }
}
