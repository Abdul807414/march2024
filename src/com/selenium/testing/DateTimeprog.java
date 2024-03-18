package com.selenium.testing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeprog {
	
	private static DateTimeFormatter dateTimeFormatter;

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate tomDate  = localDate.plusDays(1);
		System.out.println(tomDate);
		
		
		LocalDate dayaftrDate = localDate.plusDays(2);
		
		System.out.println(dayaftrDate);
		
		LocalDate daybeforeDate = localDate.minusDays(1);
System.out.println(daybeforeDate);




		
 /*LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();		
		
		System.out.println(localDateTime);
		
		int year = localDateTime.getYear();
		
		System.out.println(year);
		
		DayOfWeek  day = localDateTime.getDayOfWeek();
		
		System.out.println(day);
	
		int dayofmonth = localDateTime.getDayOfMonth();
		
		System.out.println(dayofmonth);
		
		DateTimeFormatter.ofPattern("dd-mm-yyyy  HH:mm:ss");
		
		String formatDateTime = localDateTime.format(dateTimeFormatter);
		
		
		System.out.println(formatDateTime); */
		
	}
	

}
