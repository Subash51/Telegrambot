package com.taiger.iconverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.taiger.iconverse.telegrambot.service.TelegramService;

public class MyBot  extends TelegramLongPollingBot  {

	public MyBot() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private TelegramService telegramPoint;
	@Override
	public void onUpdateReceived(Update update) {
		
		String message = update.getMessage().getText();
		Long chatID = update.getMessage().getChatId();
		
		
		SendMessage reply = new SendMessage();
/*		reply.setChatId(chatID);
		reply.setText(message);*/
		telegramPoint = new TelegramService();
		System.out.println(message);
		if(message =="/start")
		{
			reply.setText("Welcome to Taiger Telegram Bot");
			reply.setChatId(chatID);
		}
		else
		{
			reply=	telegramPoint.processMessage(message, chatID);	
		}
		
		try {
			execute(reply);
		} catch (TelegramApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "teletaiger_bot";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "701381798:AAFJmeEgW4jaWBDvvvBkLd6_qIfcH8VGIX0";
	}
	


}
