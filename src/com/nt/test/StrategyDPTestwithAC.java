package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.FlipKart;

public class StrategyDPTestwithAC {
	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target class object
		FlipKart fpkt=ctx.getBean("fpkt",FlipKart.class);
		//Invoke the basic method
		String result=fpkt.shopping(new String[] {"mangoes","temrind","suger cane"}, new float[] {900.0f,300.0F,100.0f});
		System.out.println(result);
		}
	}
