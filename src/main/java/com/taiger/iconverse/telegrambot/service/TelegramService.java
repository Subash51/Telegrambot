package com.taiger.iconverse.telegrambot.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

@Service
public class TelegramService {


	
	public SendMessage processMessage(String message, Long chatID) {
		
		SendMessage reply = new SendMessage();
		reply.setChatId(chatID);
		// to reply for specific message
		/*reply.setReplyToMessageId(update.getMessage().getMessageId());*/
		reply.setText(getReply(message));
		reply.setParseMode("HTML");
		
		//Check if the message has expression & if yes execute the below code. (Confirm how to check the expressions)
		 InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        rowInline.add(new InlineKeyboardButton().setText("Yes").setCallbackData("Yes"));
        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        // Add it to the message
        markupInline.setKeyboard(rowsInline);
        reply.setReplyMarkup(markupInline);
		return reply;
		
	}
	
	public String getReply(String message) {
		final String url = "http://localhost:8080/iconverse-converse/message";
		RestTemplate restTemplate = new RestTemplate();
		JSONObject json = new JSONObject();
    	json.put("text",message);
    	json.put("source", "user");
    	json.put("cid", "220a97ae-184f-4f4c-8375-3886f765251d");
    	json.put("lang", "en");
    	System.out.println("before request");
    	HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        System.out.println(response);
        JSONObject result = new JSONObject(response.getBody());
      
        return result.getString("text");
	}
	
	public TelegramService() {
		// TODO Auto-generated constructor stub
	}
}
