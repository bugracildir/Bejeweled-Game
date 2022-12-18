public class Players implements Comparable<Players> {
    private String name;
    private int pointOfPlayer = 0;
    Players(String name1, int point){
        name = name1;
        pointOfPlayer = point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPointOfPlayer(int pointOfPlayer) {
        this.pointOfPlayer = pointOfPlayer;
    }

    public String getName() {
        return name;
    }

    public int getPointOfPlayer() {
        return pointOfPlayer;
    }

    @Override
    public int compareTo(Players player2) { //Compare to method for comparing two players points
        return (this.pointOfPlayer-player2.pointOfPlayer);
    }
}
