public class Line { //declaring start and end point variables
    private Point startPoint, endPoint;
    public Line (Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;

    }
    //returning start and end points
public Point getStartPoint(){
        return startPoint;
}
public Point getEndPoint(){
        return endPoint;

}
public void setStartPoint(Point startPoint){
        this.startPoint = startPoint;
}
public void setEndPoint(Point endPoint){
        this.endPoint = endPoint;
}
//function of the length of the line and returning the line's length
public double getLength() {
    double x1, y1, len = 0;
    x1=this.startPoint.getxCoordinate()-this.endPoint.getxCoordinate();
    y1=this.startPoint.getyCoordinate()-this.endPoint.getyCoordinate();
    len=Math.sqrt(x1*x1+y1*y1);
    return len;
    }
}

