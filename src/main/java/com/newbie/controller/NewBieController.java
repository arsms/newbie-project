package com.newbie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newbie.service.NewBieService;

@RestController
public class NewBieController {

	@Autowired
	private NewBieService NewBieService;

	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String getMessage(){
		return "Hello world";
	}

	@RequestMapping(value="/echo",method=RequestMethod.GET)
	public String getEchoMessage(@RequestParam(value="mes",required=true)String message){
		return message;
	}


	@RequestMapping(value="/echo1",method=RequestMethod.GET)
	public String getEchoMessage1(@RequestParam(value="mes",required=true)String message){
		String anser=NewBieService.getMessage(message);
		return anser;
	}




}
