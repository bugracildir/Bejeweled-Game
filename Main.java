import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Players currentPlayer = new Players(null, 0); //Creating new player
        ArrayList<Players> playerList = new ArrayList<>(); //Creating player list, I will add all players in this list according to leaderboard.txt

        File monitoring = new File("monitoring.txt");
        FileWriter writeMonitoring = new FileWriter(monitoring);

        File gameGrid = new File(args[0]);
        Scanner scanGameGrid = new Scanner(gameGrid);

        File command = new File(args[1]);
        Scanner scanCommand = new Scanner(command);

        writeMonitoring.write("Game Grid:\n\n");

        LeaderBoard.readLeaderBoard(playerList, currentPlayer); //This method takes all the players in leaderboard.txt and adds them to playerList

        Jewels[][] gameGridList = GameGrid.readGameGrid(scanGameGrid); //Matrix for all the jewels in the gameGrid and the method will fill the matrix

        GameGrid.printGameGrid(gameGridList, writeMonitoring); //This method prints GameGrid's current situation

        ExecuteCommandFile.executeCommandFile(writeMonitoring, currentPlayer, gameGridList, playerList, scanCommand); //This method takes commands in command.txt and executes them

        writeMonitoring.close();
    }

}