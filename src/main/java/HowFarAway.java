import java.util.Scanner;
import

public class HowFarAway 
{
    public static void main(String[] args)
    {

    //Gathering input for computing
      Scanner input = new Scanner(System.in); 
      double startLat = input.nextDouble();
      double startLong = input.nextDouble();
      double endLat = input.nextDouble();
      double endLong = input.nextDouble();

      //Geolocation
      Geolocation start = new Geolocation (startLat, startLong);
      Geolocation end = new Geolocation (endLat, endLong);
      double distance = start.distanceFrom(end);
      distance = start.distanceFrom(end);

      System.out.print(distance);
    }
}