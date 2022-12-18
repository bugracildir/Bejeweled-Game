import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExecuteCommandFile {
    public static void executeCommandFile(FileWriter writeMonitoring, Players currentPlayer, Jewels[][] gameGridList, ArrayList<Players> playerList, Scanner scanCommand) throws IOException {
        //This method takes commands and execute them one by one
        while (scanCommand.hasNext()){
            String commandLine = scanCommand.nextLine();
            String [] coordinates = commandLine.split(" ");
            if (coordinates.length==2){
                ifCommandIsCoordinate(writeMonitoring, commandLine, coordinates, gameGridList, currentPlayer);

            }
            else if (commandLine.equals("E")){
                ifCommandLineIsE(writeMonitoring, currentPlayer, scanCommand, playerList);
            }
        }
    }




    public static void ifCommandIsCoordinate(FileWriter writeMonitoring, String commandLine, String[] coordinates1, Jewels[][] gameGridList, Players currentPlayer) throws IOException {
        //If command is coordinate, this method will pop the jewels, apply gravity and write the current situation of GameGrid to monitoring.txt
        try {
            ArrayList<String> mathematicalSymbols = new ArrayList<>();
            mathematicalSymbols.add("+");
            mathematicalSymbols.add("-");
            mathematicalSymbols.add("/");
            mathematicalSymbols.add("|");
            mathematicalSymbols.add("\\");
            writeMonitoring.write("Select coordinate or enter E to end the game: " + commandLine + "\n\n");
            int rowNumberOfPoint = Integer.parseInt(coordinates1[0]);
            int columnNumberOfPoint = Integer.parseInt(coordinates1[1]);
            int currentPoint = currentPlayer.getPointOfPlayer();
            String nameOfPoint = gameGridList[rowNumberOfPoint][columnNumberOfPoint].getName();
            if ((nameOfPoint.equals("D")) || (nameOfPoint.equals("S")) || (nameOfPoint.equals("T")) || (nameOfPoint.equals("W")) || (mathematicalSymbols.contains(nameOfPoint))) {

                gameGridList[rowNumberOfPoint][columnNumberOfPoint].ifThePointIsThis(gameGridList, columnNumberOfPoint, rowNumberOfPoint, currentPlayer, mathematicalSymbols);
                goDownIfEmpty(gameGridList);
                GameGrid.printGameGrid(gameGridList, writeMonitoring);
                writeMonitoring.write("Score: " + (currentPlayer.getPointOfPlayer() - currentPoint) + " points\n\n");
            } else if (nameOfPoint.equals(" ")) {
                writeMonitoring.write("Please enter a valid coordinate\n\n");
            }
        }
        catch (Exception e){
            writeMonitoring.write("Please enter a valid coordinate\n\n");
        }
    }


    public static void ifCommandLineIsE(FileWriter writeMonitoring, Players currentPlayer, Scanner scanCommand, ArrayList<Players> playerList) throws IOException {
        //If command line is E, this method will write monitoring txt to last things
        writeMonitoring.write("Select coordinate or enter E to end the game: E \n\n");
        currentPlayer.setName(scanCommand.nextLine());
        writeMonitoring.write("Total score: " + currentPlayer.getPointOfPlayer() + "\n\n");
        writeMonitoring.write("Enter name: " + currentPlayer.getName() + "\n\n");
        LeaderBoard.printLeaderBoard(currentPlayer, playerList); //Method for updating leaderboard.txt with currentPlayer
        LeaderBoard.findTheRank(writeMonitoring, currentPlayer,playerList); // Method for finding rank of player and the difference between player and writing them to monitoring.txt
        writeMonitoring.write("Good bye!");
    }


    public static void goDownIfEmpty(Jewels[][] gameGridList){ //This method will apply gravity if there is no jewel under a jewel, jewel will go dowm
        for (int a = 0; a<3 ; a++) {
            for (int row =GameGrid.getRowNumber()-1; row > -1; row--) {
                for (int column = GameGrid.getColumnNumber()-1; column > -1; column--) {
                    try {
                        if ((gameGridList[row][column].getName().equals(" ")) && (!(gameGridList[row - 1][column].getName().equals(" ")))) {
                            gameGridList[row][column] = gameGridList[row - 1][column];
                            Jewels newJewel = new EmptyCoordinates(row-1, column);
                            gameGridList[row - 1][column] = newJewel;
                        }
                    } catch (Exception e) {
                    }

                }
            }
        }
    }

}