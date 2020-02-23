package lab3;

import java.time.*;
//import java.time.LocalTime;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2010, 01, 31);
		LocalDate today = LocalDate.now();
		/*
		 * LocalTime time = LocalTime.now(); ZonedDateTime current =
		 * ZonedDateTime.now(); String formatted =
		 * today.format(DateTimeFormatter.ISO_DATE); ZonedDateTime
		 * currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		 * System.out.println("Number of days " + today.getDayOfMonth());
		 * System.out.println("Number of days " + today.getMonth());
		 * System.out.println("Number of days " + today.getYear());
		 * System.out.println("Time " + time); System.out.println("Hours  " +
		 * time.getHour()); System.out.println("Minutes  " + time.getMinute());
		 * System.out.println("India "+ current); System.out.println(
		 * "Paris time "+ currentTimeInParis); System.out.println("Old date "+
		 * date); System.out.println(formatted);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase day(date)");
		int day = sc.nextInt();
		System.out.println("Enter purchase Month");
		int month = sc.nextInt();
		System.out.println("Enter purchase year");
		int year = sc.nextInt();
		System.out.println("Enter Expiry month");
		int wMonth = sc.nextInt();
		System.out.println("Enter Expiry year");
		int wYear = sc.nextInt();
		CalculateDate(LocalDate.of(year, month, day), wMonth, wYear);
		getDuration(date, today);
		sc.close();
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println(
		 * "Enter the time zone"); String zone = sc.nextLine();
		 * 
		 * zonedDateAndTime(zone); sc.close();
		 */
	}

	static void getDuration(LocalDate date, LocalDate today) {
		int d1 = today.getDayOfMonth();
		int m1 = today.getMonthValue();
		int y1 = today.getYear();
		int d2 = date.getDayOfMonth();
		int m2 = date.getMonthValue();
		int y2 = date.getYear();
		System.out.println("Days difference : " + Math.abs(d2 - d1));
		System.out.println("Months difference : " + Math.abs(m2 - m1));
		System.out.println("years difference : " + Math.abs(y2 - y1));
		// Duration between dates,months, years between two dates using Period
		// Class
		/*
		 * Period p = Period.between(date, today); int years = p.getYears(); int
		 * months = p.getMonths(); int days = p.getDays(); System.out.println(
		 * "Difference in days " + days); System.out.println(
		 * "Difference in Months " + months); System.out.println(
		 * "Difference in years " + years);
		 */

	}

	static void CalculateDate(LocalDate date, int months, int years) {
		int days = date.getDayOfMonth();
		int mon = date.getMonthValue();
		int year = date.getYear();
		int newYear = 0;
		int newMonth = 0;
		if ((mon + months) > 12) {
			if (months % 12 == 0) {
				newYear = (months / 12) + year + years;
				newMonth = mon;
			} else {
				newYear = (mon + months) / 12 + year + years;
				newMonth = (int) (mon + months) % 12 + mon - 1;
			}

			System.out.println((mon + months) % 12);
		} else {
			newYear = year + years;
			newMonth = mon + months;
		}
		switch (newMonth) {
		case 2:
			if (date.getDayOfMonth() == 29 || date.getDayOfMonth() == 30 || date.getDayOfMonth() == 31) {
				days = 01;
				newMonth = 3;
			}
			break;
		case 4:
			if (date.getDayOfMonth() == 31) {
				days = 01;
				newMonth = 5;
			}
			break;
		case 6:
			if (date.getDayOfMonth() == 31) {
				days = 01;
				newMonth = 7;
			}
			break;
		case 9:
			if (date.getDayOfMonth() == 31) {
				days = 01;
				newMonth = 9;
			}
			break;
		case 11:
			if (date.getDayOfMonth() == 31) {
				days = 01;
				newMonth = 12;
			}
			break;
		}

		System.out.println(LocalDate.of(newYear, newMonth, days));
	}

	static void zonedDateAndTime(String zone) {
		ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zone));
		System.out.println("Current time in Zone " + zone + " is " + currentTime);
	}
}
