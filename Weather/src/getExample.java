import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class getExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://api.openweathermap.org/data/2.5/weather?q=London&APPID=01d244afe0bcb3eee74b8d7ea179b35a";
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		
		HttpResponse response = null;
		try {
			response = client.execute(request);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(response.getStatusLine().getStatusCode());
		
	}

}
