import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.*;

public class LeaderBoard {
    public static void readLeaderBoard(ArrayList<Players> playerList, Players currentPlayer) throws FileNotFoundException {
        //Tihs method takes people in leaderboard and adds them to arraylist playerList
        File leaderBoard = new File("leaderboard.txt");
        Scanner scanLeaderBoard = new Scanner(leaderBoard);

        while (scanLeaderBoard.hasNext()){
            String line = scanLeaderBoard.nextLine();
            String[] splitLine = line.split(" ");
            String name = splitLine[0];
            int point = Integer.parseInt(splitLine[1]);
            Players newPlayer = new Players(name , point);
            playerList.add(newPlayer);
        }
        playerList.add(currentPlayer);
        scanLeaderBoard.close();
    }


    public static void printLeaderBoard(Players currentPlayer, ArrayList<Players> playerList) throws IOException {
        //This method prints the people in playerList and writes their name and score to leaderboard.txt
        FileWriter writeLeaderBoard = new FileWriter("leaderboard.txt");
        for (Players a : playerList ){
            writeLeaderBoard.write(a.getName()+" "+a.getPointOfPlayer()+"\n");
        }
        writeLeaderBoard.close();
    }

    public static void findTheRank(FileWriter writeMonitoring, Players currentPlayer, ArrayList<Players> playerList) throws IOException {
        //This method finds the rank of current player and difference of point between one better and one worse player and writes the information to  monitoring.txt
        Comparator<Players> c = new Comparator<Players>()
        {
            public int compare(Players player1, Players player2)
            {
                return player1.compareTo(player2);
            }
        };
        Collections.sort(playerList, c);
        int indexOfCurrentPlayer = playerList.indexOf(currentPlayer);
        int rankOfPlayer = playerList.size()-indexOfCurrentPlayer;
        if ((rankOfPlayer!=1)&&(rankOfPlayer!=playerList.size())) {
            writeMonitoring.write("Your rank is " + rankOfPlayer + "/" + playerList.size() + ", your score is " + (playerList.get(indexOfCurrentPlayer + 1).
                    getPointOfPlayer() - playerList.get(indexOfCurrentPlayer).getPointOfPlayer()) + " points lower than " + playerList.get(indexOfCurrentPlayer + 1).getName() +
                    " and " + (playerList.get(indexOfCurrentPlayer).getPointOfPlayer() - playerList.get(indexOfCurrentPlayer - 1).getPointOfPlayer()) + " points higher than " +
                    playerList.get(indexOfCurrentPlayer - 1).getName() + "\n\n");
        }
        else if(rankOfPlayer==1){
            writeMonitoring.write("Your rank is " + rankOfPlayer + "/" + playerList.size() +", your score is "+ (playerList.get(indexOfCurrentPlayer).getPointOfPlayer()
                    - playerList.get(indexOfCurrentPlayer - 1).getPointOfPlayer()) + " points higher than " + playerList.get(indexOfCurrentPlayer - 1).getName() + "\n\n");
        }
        else{
            writeMonitoring.write("Your rank is " + rankOfPlayer + "/" + playerList.size() + ", your score is " + (playerList.get(indexOfCurrentPlayer + 1).
                    getPointOfPlayer() - playerList.get(indexOfCurrentPlayer).getPointOfPlayer()) + " points lower than " + playerList.get(indexOfCurrentPlayer + 1).getName());
        }
    }
}
