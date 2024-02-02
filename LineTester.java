public class LineTester {
    public static void main(String[] args) {
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Line line = new Line(startPoint, endPoint);

        /** getting start and end point coordinates from Point class objects */
        System.out.println("The start point coordinates are " + startPoint.getxCoordinate() + ", " + startPoint.getyCoordinate());
        System.out.println("The end point coordinates are " + endPoint.getxCoordinate() + ", " + endPoint.getyCoordinate());

        /** getting start and end point coordinates from Line class object */
        System.out.println("LINE'S start point coordinates: " + line.getStartPoint().getxCoordinate() + ", " + line.getStartPoint().getyCoordinate());
        System.out.println("LINE'S end point coordinates: " + line.getEndPoint().getxCoordinate() + ", " + line.getEndPoint().getyCoordinate());

        /** getting line length, should be 5 */
        System.out.println("The length of the line is " + line.getLength());

        /** change start and end point coordinates, THEN update line object with new points */
        startPoint.setxCoordinate(2);
        startPoint.setyCoordinate(7);
        endPoint.setxCoordinate(8);
        endPoint.setyCoordinate(15);
        line.setStartPoint(startPoint);
        line.setEndPoint(endPoint);

        System.out.println("---------NEW POINT----------");

        /** getting start and end point coordinates from Point class objects */
        System.out.println("The start point coordinates are " + startPoint.getxCoordinate() + ", " + startPoint.getyCoordinate());
        System.out.println("The end point coordinates are " + endPoint.getxCoordinate() + ", " + endPoint.getyCoordinate());

        /** getting start and end point coordinates from Line class object */
        System.out.println("LINE'S start point coordinates: " + line.getStartPoint().getxCoordinate() + ", " + line.getStartPoint().getyCoordinate());
        System.out.println("LINE'S end point coordinates: " + line.getEndPoint().getxCoordinate() + ", " + line.getEndPoint().getyCoordinate());

        /** getting line length, should be 10 */
        System.out.println("The length of the line is " + line.getLength());

    }
}



