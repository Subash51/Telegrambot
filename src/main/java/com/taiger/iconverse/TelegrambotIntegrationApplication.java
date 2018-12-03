package com.taiger.iconverse;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.fasterxml.jackson.core.JsonProcessingException;


@SpringBootApplication
public class TelegrambotIntegrationApplication extends SpringBootServletInitializer{

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(TelegrambotIntegrationApplication.class, args);
		ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MyBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
		System.out.println("Entered into TelegramBot");
		
		/*HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://localhost:8080/iconverse-converse/message");

        try {
            // Add your data
        	JSONObject json = new JSONObject();
        	json.put("text","How are you");
        	json.put("source", "user");
        	json.put("cid", "220a97ae-184f-4f4c-8375-3886f765251d");
        	json.put("lang", "en");
        	StringEntity e = new StringEntity(json.toString());
        	httppost.setEntity(e);

            // Execute HTTP Post Request
        	System.out.println("before post");
            HttpResponse response = httpclient.execute(httppost);
            System.out.println("after post");
            System.out.println("this is the response "+response);
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            System.out.println("CPE"+e);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("IOE"+e);
        }*/
        
		
		
        
		
		/*IConverseMessage message = new IConverseMessage();
		message.setText("How are you");
		message.setSource("User");
		message.setCid("920949ac-a3ba-4744-9c36-e4375552aee1");
		message.setLang("en");
		String url = "http://localhost:8080/iconverse-admin/message";
	ObjectMapper mapper = new ObjectMapper();	
		String jsonInString = mapper.writeValueAsString(message);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
		httpEntity = new HttpEntity<>(jsonInString, httpHeaders);
		
		RestTemplate restTemplate = new RestTemplate();
		String reply;
		reply = restTemplate.postForObject(url, httpEntity, String.class);
		System.out.println(reply);*/		
		
	}
	
}
