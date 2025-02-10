package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {
	public static void main(String[] args) {
		Date dateToday = new Date();
		System.out.println(dateToday);
		// 원하는 문자열 format 형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(dateToday));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss/", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf2.setTimeZone(timeZone);
		System.out.println(sdf2.format(dateToday));

		// String do date
		String str = "2025/01/21 09-10-00"; // 입력
		sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss"); // 데이터 포맷
		try { // 예외 처리
			Date startDt = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Calendar
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday.getTime());
		System.out.println(calToday.get(Calendar.DATE));
		System.out.println(calToday.get(Calendar.MONTH) + 1);
		System.out.println(calToday.get(Calendar.YEAR));
		System.out.println(calToday.get(Calendar.HOUR_OF_DAY));

		calToday.add(Calendar.DATE, 1);
		System.out.println(sdf.format(calToday.getTime()));

		calToday.add(Calendar.DATE, 3);
		System.out.println(sdf.format(calToday.getTime()));

		calToday.add(Calendar.MONTH, 5);
		System.out.println(sdf.format(calToday.getTime()));
		Calendar calendars = Calendar.getInstance();
		int year = 2025;
		int month = 2;
		calendars.set(year, month - 1, 1); // 해당 월의 1일 날짜
		System.out.println(sdf.format(calendars.getTime()));

		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);

		int dayOfWeek = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(calendars.get(Calendar.DAY_OF_WEEK));
		System.out.println(year + "년" + month + "월 달력");
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		for (int i = 0; i <= 42; i++) {
			if (i < dayOfWeek) {
				System.out.print("\t");
			} else {
				System.out.printf("%d\t", current);
				current++;
				if (current > lastDay)
					break;
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		// 토, 일 제외해서 출력하는 캘린더
		workingCalendar(2025, 10);
	}
	
	public static void workingCalendar(int year, int month)
	{
		Calendar calendars = Calendar.getInstance();
		calendars.set(year, month - 1, 1);
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH); //
		int dayOfWeek = calendars.get(Calendar.DAY_OF_WEEK); //
		System.out.println();
		System.out.println(year + "년" + month + "월 달력");
		System.out.print("월\t화\t수\t목\t금");
		int current = 1;
		for (int i = 0; i <= 42; i++) {
			if (i < dayOfWeek) {
				if(i!=1) {
					System.out.print("\t");
					}
			} else {
				if(!(i%7==1 || i%7==0)) { //i 값이 1 또는 7 일때 건너뛰기 1=일 7=토
					System.out.printf("%2d\t", current);;
				}
				current++;
				if (current > lastDay)
				{
					break;
				}
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}