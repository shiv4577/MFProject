package com.w2a.rough;

import java.util.Date;

public class TimeStamp {

	public static Date d;
	
	
	public static void main(String[] args) {
		Date d= new Date();
		
		String ScreenshotName= d.toString().replace(":", "_").replace(" ", " ")+".jpg";
		System.out.println(ScreenshotName);
	}
	
}
