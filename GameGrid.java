import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GameGrid {
    private static int rowNumber;
    private static int columnNumber;

    public static Jewels[][] readGameGrid(Scanner scanGameGrid) throws FileNotFoundException {
        //Tihs method adds all jewels in GameGrid to gameGridList matrix
        Jewels[][] gameGridList=null;
        while (scanGameGrid.hasNext()) {
            String line = scanGameGrid.nextLine();
            String[] lineList = line.split(" ");
            columnNumber = lineList.length;
            rowNumber++;
        }
        scanGameGrid.close();
        File gameGrid1 = new File("gameGrid.txt");
        Scanner scanGameGrid2 = new Scanner(gameGrid1);
        gameGridList = new Jewels[rowNumber][columnNumber];
        int rowNumber2 = 0;
        while (scanGameGrid2.hasNext()) {
            Jewels newJewel = null;
            String line = scanGameGrid2.nextLine();
            String[] lineList = line.split(" ");
            for (int columnNumber2 = 0; columnNumber2 < lineList.length; columnNumber2++) {
                String jewelSign = lineList[columnNumber2];
                if (jewelSign.equals("S")) {
                    newJewel = new Square(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("D")) {
                    newJewel = new Diamond(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("W")) {
                    newJewel = new Wildcard(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("T")) {
                    newJewel = new Triangle(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("\\")) {
                    newJewel = new BackSlash(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("+")) {
                    newJewel = new Plus(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("/")) {
                    newJewel = new Slash(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("-")) {
                    newJewel = new Minus(rowNumber2, columnNumber2);
                }else if (jewelSign.equals("|")) {
                    newJewel = new Pipe(rowNumber2, columnNumber2);
                }
                gameGridList[rowNumber2][columnNumber2] = newJewel;
            }
        rowNumber2++;
        }
        scanGameGrid2.close();
        return gameGridList;
    }


    public static void printGameGrid(Jewels[][] gameGridList, FileWriter writeMonitoring) throws IOException {
        for (int i = 0; i < rowNumber; i++) {

            for (int j = 0; j < columnNumber; j++) {
                writeMonitoring.write(gameGridList[i][j].getName()+" ");
            }
            writeMonitoring.write("\n");
        }
        writeMonitoring.write("\n");
    }



    public static int getRowNumber() {
        return rowNumber;
    }

    public static void setRowNumber(int rowNumber2) {
        rowNumber = rowNumber2;
    }

    public static int getColumnNumber() {
        return columnNumber;
    }

    public static void setColumnNumber(int columnNumber2) {
        columnNumber = columnNumber2;
    }


}
