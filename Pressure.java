import org.json; 

public class Pressure 
{
  public Pressure() {
  }
  
  public static int GetBarometricPressure(double lon, double lat)
  {
    try {
      AndroidHttpClient client = AndroidHttpClient.newInstance("AGENT");
      String rawData = GetWeatherData(lon,lat);
      JSONObject data JSONObject(String json);
      //data.get
      //
      
    }
    catch(Exception e)
    {
      Log.d("Pressure Get Failure",e.toString());
      return 1000;
    }
  }
  
  private String GetWeatherData(double lon, double lat) {
    StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet httpGet = new HttpGet(String.format("http://api.openweathermap.org/data/2.5/weather?lat=%1$s&lon=%2$s",lon,lat);
    try {
      HttpResponse response = client.execute(httpGet);
      StatusLine statusLine = response.getStatusLine();
      int statusCode = statusLine.getStatusCode();
      if (statusCode == 200) {
        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(content));
        String line;
        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
      } else {
        Log.e(ParseJSON.class.toString(), "Failed to download file");
      }
    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return builder.toString();
  }
  
}
