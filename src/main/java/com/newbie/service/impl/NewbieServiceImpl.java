package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewBieService;

@Service
public class NewbieServiceImpl implements NewBieService {

	@Override
	public String getMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ
		
		return "bot :"+ message;
	}

}
