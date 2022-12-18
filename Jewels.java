import java.util.ArrayList;

public abstract class Jewels {
    private int points;
    private String name;
    private int columnNumberOfPoint;
    private int rowNumberOfPoint;


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getColumnNumberOfPoint() {
        return columnNumberOfPoint;
    }

    public void setColumnNumberOfPoint(int columnNumberOfPoint) {
        this.columnNumberOfPoint = columnNumberOfPoint;
    }

    public int getRowNumberOfPoint() {
        return rowNumberOfPoint;
    }

    public void setRowNumberOfPoint(int rowNumberOfPoint) {
        this.rowNumberOfPoint = rowNumberOfPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Jewels(String name, int points, int xCoordinate, int yCoordinate) {
        this.points = points;
        this.name = name;
        this.columnNumberOfPoint = xCoordinate;
        this.rowNumberOfPoint = yCoordinate;
    }

    public abstract void ifThePointIsThis(Jewels[][] gameGridList, int columnNumberOfPoint, int rowNumberOfPoint, Players currentPlayer,  ArrayList<String> mathematicalSymbols);
    //This method check the jewel and find if it pops
}
