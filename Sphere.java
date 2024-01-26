public class Sphere {
    //create private field of sphere class
    private double radius;

    public Sphere()
    {
        //default constructor
        radius = 5.0;

    }
    public Sphere(double newRadius)
    {
        //parameterized constructor
        //initialized side to user defined value
        radius = newRadius;

    }
    public double getRadius()
    {
        //method to return value of object's side
        return radius;

    }
    public double getSurfaceArea() //method that calculates the surface area of the sphere object and return value
    {
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume()
    {
        //method that calculates volume of the sphere
        return (4.0/3) * Math.PI * radius * radius * radius;

    }
    public void setRadius(double newRadius)
    {
        //method to set a new value of object and return value
        radius = newRadius;
    }

}
