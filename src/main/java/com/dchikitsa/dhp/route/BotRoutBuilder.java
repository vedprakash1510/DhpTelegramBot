package com.dchikitsa.dhp.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.dchikitsa.dhp.service.Bot;


@Component
public class BotRoutBuilder extends RouteBuilder {
	

	@Override
	public void configure() throws Exception {
		
		  from("telegram:bots").bean(Bot.class).to("telegram:bots");

	
	}

}