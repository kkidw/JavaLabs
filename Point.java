public class Point {
//declaring variables for x & y coordinates
    private double xCoordinate;
    private double yCoordinate;
    private Object xCoordiante;

    //building constructor for the coordinates and declaring variables
    public Point(double x, double y) {
        xCoordinate = x;
        yCoordinate = y;

    }
    //returning the x and y coordinate
    public double getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;

    }
    public double getyCoordinate(){
        return yCoordinate;

    }
    public void setyCoordinate(double yCoordinate){
        this.yCoordinate = yCoordinate;

    }


    public Object getxCoordiante() {
        return xCoordiante;
    }

    public void setxCoordiante(Object xCoordiante) {
        this.xCoordiante = xCoordiante;
    }
}




