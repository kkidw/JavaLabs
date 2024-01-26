// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class sphereDemo {
    public static void main(String[] args)
    {
        Sphere mySphere = new Sphere();

        System.out.println("The radius of the sphere is " + mySphere.getRadius()); //get radius of sphere and print
        System.out.println("The surface are of the sphere is " + mySphere.getSurfaceArea()); //get surface area of sphere and print
        System.out.println("The volume of the sphere is " + mySphere.getVolume()); //get volume of sphere and print

        mySphere.setRadius(7.5);

        System.out.println("The radius of the sphere is " + mySphere.getRadius()); //get side of sphere and print
        System.out.println("The surface are of the sphere is " + mySphere.getSurfaceArea());
        System.out.println("The volume of the sphere is " + mySphere.getVolume()); //get volume of sphere and print






    }
}