

public class Pressure 
{
  public Pressure() {
  }
  
  public static int GetBarometricPressure()
  {
    try {
      AndroidHttpClient client = AndroidHttpClient.newInstance("AGENT");
      client.
      //http://api.openweathermap.org/data/2.5/weather?lat=35.25&lon=139.25
    }
    catch(Exception e)
    {
      Log.d("Pressure Get Failure",e.toString());
      return 1000;
    }
  
}
