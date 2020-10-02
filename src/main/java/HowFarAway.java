import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {

      //Input gathered to get computed
      Scanner input = new Scanner(System.in); 
      System.out.println("Enter the latitude of the starting location: ");
      double startLat = input.nextDouble();
      System.out.println("Enter the longitude of the starting location: ");
      double startLong = input.nextDouble();
      System.out.println("Enter the latitude of the ending location: ");
      double endLat = input.nextDouble();
      System.out.println("Enter the longitude of the ending location: ");
      double endLong = input.nextDouble();

      //Geolocating
      GeoLocation start = new GeoLocation(startLat, startLong);
      GeoLocation end = new GeoLocation(endLat, endLong);
      double distance = start.distanceFrom(end);
      System.out.print("The distance is " + distance + " miles.");

    }
}