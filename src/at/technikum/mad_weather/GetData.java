package at.technikum.mad_weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GetData extends Activity {
	String city, country, woeid;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        city = b.getString(city);
        country = b.getString(country);
        try {
			woeid = getWoeid(city, country);
		} catch (MalformedURLException e) {
			Log.d("getWoeid","MalformedURLException");
			e.printStackTrace();
		} catch (IOException e) {
			Log.d("getWoeid","IOException");
			e.printStackTrace();
		} catch (JSONException e) {
			Log.d("getWoeid","JSONException");
			e.printStackTrace();
		}
        Log.d("woeid",woeid);
       
        
        
        
        
        
        setResult(RESULT_OK, i);
        finish();
    }
	private String getWoeid(String city, String country) throws MalformedURLException, IOException, JSONException{
		String result = null;
		URLConnection connection = new URL("http://where.yahooapis.com/geocode?q="+city).openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()), 1024 * 16);
		StringBuffer builder = new StringBuffer();
		String line;
		while ((line = reader.readLine()) != null) {
		  builder.append(line).append("\n");
		}
		JSONObject object = new JSONObject(builder.toString()); 
		result = object.getString("woeid");
		return result;
	}
}
