public class MatchingJewels {
    public static void throughLeftMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint ][columnNumberOfPoint - 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint ][columnNumberOfPoint - 2].setName(" ");
    }
    public static void throughRightMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint][columnNumberOfPoint + 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint + 2].setName(" ");
    }
    public static void throughUpMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint -1][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint -2][columnNumberOfPoint].setName(" ");
    }
    public static void throughDownMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint+1][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint+2][columnNumberOfPoint].setName(" ");
    }
    public static void throughLeftUpMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint - 1][columnNumberOfPoint - 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint - 2][columnNumberOfPoint - 2].setName(" ");
    }
    public static void throughRightDownMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint + 1][columnNumberOfPoint + 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint + 2][columnNumberOfPoint + 2].setName(" ");
    }
    public static void throughRightUpMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint - 1][columnNumberOfPoint + 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint - 2][columnNumberOfPoint + 2].setName(" ");
    }
    public static void throughLeftDownMatch(Jewels[][] gameGridList, int rowNumberOfPoint, int columnNumberOfPoint){
        gameGridList[rowNumberOfPoint + 1][columnNumberOfPoint - 1].setName(" ");
        gameGridList[rowNumberOfPoint][columnNumberOfPoint].setName(" ");
        gameGridList[rowNumberOfPoint + 2][columnNumberOfPoint - 2].setName(" ");
    }


}
