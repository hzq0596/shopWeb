package com.hzq.shop.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;

public class DateUtil {
	private final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
	private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
	private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * Base ISO 8601 Date format yyyyMMdd i.e., 20021225 for the 25th day of December in the year
	 * 2002
	 */
	public static final String ISO_DATE_FORMAT = "yyyyMMdd";
	/**
	 * Expanded ISO 8601 Date format yyyy-MM-dd i.e., 2002-12-25 for the 25th day of December in the
	 * year 2002
	 */
	public static final String ISO_EXPANDED_DATE_FORMAT = "yyyy-MM-dd";
	/**
	 * yyyy-MM-dd hh:mm:ss
	 */
	public static String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static String DATE_PATTERN = "yyyyMMddHHmmss";
	/**
	 * 则个
	 */
	private static boolean LENIENT_DATE = false;
	private static Random random = new java.util.Random();
	private static final int ID_BYTES = 10;

	/**
	 * 获取YYYY格式
	 * @return
	 */
	public static String getYear() {
		return sdfYear.format(new Date());
	}
	/**
	 * 获取YYYY-MM-DD格式
	 * @return
	 */
	public static String getDay() {
		return sdfDay.format(new Date());
	}
	/**
	 * 获取YYYYMMDD格式
	 * @return
	 */
	public static String getDays() {
		return sdfDays.format(new Date());
	}
	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * @return
	 */
	public static String getTime() {
		return sdfTime.format(new Date());
	}
	/**
	 * @Title: compareDate
	 * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
	 * @param s
	 * @param e
	 * @return boolean
	 * @throws @author luguosui
	 */
	public static boolean compareDate(String s, String e) {
		if (fomatDate(s) == null || fomatDate(e) == null) {
			return false;
		}
		return fomatDate(s).getTime() >= fomatDate(e).getTime();
	}
	/**
	 * 格式化日期
	 * @return
	 */
	public static Date fomatDate(String date) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return fmt.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 校验日期是否合法
	 * @return
	 */
	public static boolean isValidDate(String s) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fmt.parse(s);
			return true;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return false;
		}
	}
	public static int getDiffYear(String startTime, String endTime) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long aa = 0;
			int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / (1000 * 60 * 60 * 24))
					/ 365);
			return years;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return 0;
		}
	}
	/**
	 * <li>功能描述：时间相减得到天数
	 * @param beginDateStr
	 * @param endDateStr
	 * @return long
	 * @author Administrator
	 */
	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate = null;
		java.util.Date endDate = null;
		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
		// System.out.println("相隔的天数="+day);
		return day;
	}
	/**
	 * 得到n天之后的日期
	 * @param days
	 * @return
	 */
	public static String getAfterDayDate(String days) {
		int daysInt = Integer.parseInt(days);
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();
		SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdfd.format(date);
		return dateStr;
	}
	/**
	 * 得到n天之后是周几
	 * @param days
	 * @return
	 */
	public static String getAfterDayWeek(String days) {
		int daysInt = Integer.parseInt(days);
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("E");
		String dateStr = sdf.format(date);
		return dateStr;
	}
	public synchronized static String generateId() {
		StringBuffer result = new StringBuffer();
		result = result.append(System.currentTimeMillis());
		for (int i = 0; i < ID_BYTES; i++) {
			result = result.append(random.nextInt(10));
		}
		return result.toString();
	}
	protected static final float normalizedJulian(float JD) {
		float f = Math.round(JD + 0.5f) - 0.5f;
		return f;
	}
	/**
	 * Returns the Date from a julian. The Julian date will be converted to noon GMT, such that it
	 * matches the nearest half-integer (i.e., a julian date of 1.4 gets changed to 1.5, and 0.9
	 * gets changed to 0.5.)
	 * @param JD the Julian date
	 * @return the Gregorian date
	 */
	public static final Date toDate(float JD) {
		/*
		 * To convert a Julian Day Number to a Gregorian date, assume that it is for 0 hours,
		 * Greenwich time (so that it ends in 0.5). Do the following calculations, again dropping
		 * the fractional part of all multiplicatons and divisions. Note: This method will not give
		 * dates accurately on the Gregorian Proleptic Calendar, i.e., the calendar you get by
		 * extending the Gregorian calendar backwards to years earlier than 1582. using the
		 * Gregorian leap year rules. In particular, the method fails if Y<400.
		 */
		float Z = (normalizedJulian(JD)) + 0.5f;
		float W = (int) ((Z - 1867216.25f) / 36524.25f);
		float X = (int) (W / 4f);
		float A = Z + 1 + W - X;
		float B = A + 1524;
		float C = (int) ((B - 122.1) / 365.25);
		float D = (int) (365.25f * C);
		float E = (int) ((B - D) / 30.6001);
		float F = (int) (30.6001f * E);
		int day = (int) (B - D - F);
		int month = (int) (E - 1);
		if (month > 12) {
			month = month - 12;
		}
		int year = (int) (C - 4715); // (if Month is January or February) or C-4716 (otherwise)
		if (month > 2) {
			year--;
		}
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1); // damn 0 offsets
		c.set(Calendar.DATE, day);
		return c.getTime();
	}
	/**
	 * Returns the days between two dates. Positive values indicate that the second date is after
	 * the first, and negative values indicate, well, the opposite. Relying on specific times is
	 * problematic.
	 * @param early the "first date"
	 * @param late the "second date"
	 * @return the days between the two dates
	 */
	public static final int daysBetween(Date early, Date late) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(early);
		c2.setTime(late);
		return daysBetween(c1, c2);
	}
	/**
	 * Returns the days between two dates. Positive values indicate that the second date is after
	 * the first, and negative values indicate, well, the opposite.
	 * @param early
	 * @param late
	 * @return the days between two dates.
	 */
	public static final int daysBetween(Calendar early, Calendar late) {
		return (int) (toJulian(late) - toJulian(early));
	}
	/**
	 * Return a Julian date based on the input parameter. This is based from calculations found at
	 * <a href="http://quasar.as.utexas.edu/BillInfo/JulianDatesG.html">Julian Day Calculations
	 * (Gregorian Calendar)</a>, provided by Bill Jeffrys.
	 * @param c a calendar instance
	 * @return the julian day number
	 */
	public static final float toJulian(Calendar c) {
		int Y = c.get(Calendar.YEAR);
		int M = c.get(Calendar.MONTH);
		int D = c.get(Calendar.DATE);
		int A = Y / 100;
		int B = A / 4;
		int C = 2 - A + B;
		float E = (int) (365.25f * (Y + 4716));
		float F = (int) (30.6001f * (M + 1));
		float JD = C + D + E + F - 1524.5f;
		return JD;
	}
	/**
	 * Return a Julian date based on the input parameter. This is based from calculations found at
	 * <a href="http://quasar.as.utexas.edu/BillInfo/JulianDatesG.html">Julian Day Calculations
	 * (Gregorian Calendar)</a>, provided by Bill Jeffrys.
	 * @param date
	 * @return the julian day number
	 */
	public static final float toJulian(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return toJulian(c);
	}
	/**
	 * @param isoString
	 * @param fmt
	 * @param field Calendar.YEAR/Calendar.MONTH/Calendar.DATE
	 * @param amount
	 * @return
	 * @throws ParseException
	 */
	public static final String dateIncrease(String isoString, String fmt, int field, int amount) {
		try {
			Calendar cal = GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
			cal.setTime(stringToDate(isoString, fmt, true));
			cal.add(field, amount);
			return dateToString(cal.getTime(), fmt);
		} catch (Exception ex) {
			return null;
		}
	}
	/**
	 * Time Field Rolling function. Rolls (up/down) a single unit of time on the given time field.
	 * @param isoString
	 * @param field the time field.
	 * @param up Indicates if rolling up or rolling down the field value.
	 * @param expanded use formating char's
	 * @exception ParseException if an unknown field value is given.
	 */
	public static final String roll(String isoString, String fmt, int field, boolean up) throws ParseException {
		Calendar cal = GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.setTime(stringToDate(isoString, fmt));
		cal.roll(field, up);
		return dateToString(cal.getTime(), fmt);
	}
	/**
	 * Time Field Rolling function. Rolls (up/down) a single unit of time on the given time field.
	 * @param isoString
	 * @param field the time field.
	 * @param up Indicates if rolling up or rolling down the field value.
	 * @exception ParseException if an unknown field value is given.
	 */
	public static final String roll(String isoString, int field, boolean up) throws ParseException {
		return roll(isoString, DATETIME_PATTERN, field, up);
	}
	/**
	 * java.util.Date
	 * @param dateText
	 * @param format
	 * @param lenient
	 * @return
	 */
	public static Date stringToDate(String dateText, String format, boolean lenient) {
		if (dateText == null) {
			return null;
		}
		DateFormat df = null;
		try {
			if (format == null) {
				df = new SimpleDateFormat();
			} else {
				df = new SimpleDateFormat(format);
			}
			// setLenient avoids allowing dates like 9/32/2001
			// which would otherwise parse to 10/2/2001
			df.setLenient(false);
			return df.parse(dateText);
		} catch (ParseException e) {
			return null;
		}
	}
	/**
	 * @return Timestamp
	 */
	public static java.sql.Timestamp getCurrentTimestamp() {
		return new java.sql.Timestamp(new java.util.Date().getTime());
	}
	/**
	 * java.util.Date
	 * @param dateText
	 * @param format
	 * @return
	 */
	public static Date stringToDate(String dateString, String format) {
		return stringToDate(dateString, format, LENIENT_DATE);
	}
	/**
	 * java.util.Date
	 * @param dateText
	 */
	public static Date stringToDate(String dateString) {
		return stringToDate(dateString, ISO_EXPANDED_DATE_FORMAT, LENIENT_DATE);
	}
	/**
	 * @return
	 * @param pattern
	 * @param date
	 */
	public static String dateToString(Date date, String pattern) {
		if (date == null) {
			return null;
		}
		try {
			SimpleDateFormat sfDate = new SimpleDateFormat(pattern);
			sfDate.setLenient(false);
			return sfDate.format(date);
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		return dateToString(date, ISO_EXPANDED_DATE_FORMAT);
	}
	/**
	 * @return
	 */
	public static Date getCurrentDateTime() {
		java.util.Calendar calNow = java.util.Calendar.getInstance();
		java.util.Date dtNow = calNow.getTime();
		return dtNow;
	}
	/**
	 * @param pattern
	 * @return
	 */
	public static String getCurrentDateString(String pattern) {
		return dateToString(getCurrentDateTime(), pattern);
	}
	/**
	 * yyyy-MM-dd
	 * @return
	 */
	public static String getCurrentDateString() {
		return dateToString(getCurrentDateTime(), ISO_EXPANDED_DATE_FORMAT);
	}
	/**
	 * 返回固定格式的当前时间 yyyy-MM-dd hh:mm:ss
	 * @param date
	 * @return
	 */
	public static String dateToStringWithTime() {
		return dateToString(new java.util.Date(), DATETIME_PATTERN);
	}
	/**
	 * yyyy-MM-dd hh:mm:ss
	 * @param date
	 * @return
	 */
	public static String dateToStringWithTime(Date date) {
		return dateToString(date, DATETIME_PATTERN);
	}
	/**
	 * @param date
	 * @param days
	 * @return java.util.Date
	 */
	public static Date dateIncreaseByDay(Date date, int days) {
		Calendar cal = GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
	/**
	 * @param date
	 * @param days
	 * @return java.util.Date
	 */
	public static Date dateIncreaseByMonth(Date date, int mnt) {
		Calendar cal = GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.setTime(date);
		cal.add(Calendar.MONTH, mnt);
		return cal.getTime();
	}
	/**
	 * @param date
	 * @param mnt
	 * @return java.util.Date
	 */
	public static Date dateIncreaseByYear(Date date, int mnt) {
		Calendar cal = GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.setTime(date);
		cal.add(Calendar.YEAR, mnt);
		return cal.getTime();
	}
	/**
	 * @param date yyyy-MM-dd
	 * @param days
	 * @return yyyy-MM-dd
	 */
	public static String dateIncreaseByDay(String date, int days) {
		return dateIncreaseByDay(date, ISO_DATE_FORMAT, days);
	}
	/**
	 * @param date
	 * @param fmt
	 * @param days
	 * @return
	 */
	public static String dateIncreaseByDay(String date, String fmt, int days) {
		return dateIncrease(date, fmt, Calendar.DATE, days);
	}
	/**
	 * @param src
	 * @param srcfmt
	 * @param desfmt
	 * @return
	 */
	public static String stringToString(String src, String srcfmt, String desfmt) {
		return dateToString(stringToDate(src, srcfmt), desfmt);
	}
	/**
	 * @param date
	 * @return string
	 */
	public static String getYear(Date date) {
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("yyyy");
		String cur_year = formater.format(date);
		return cur_year;
	}
	/**
	 * @param date
	 * @return string
	 */
	public static String getMonth(Date date) {
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("MM");
		String cur_month = formater.format(date);
		return cur_month;
	}
	/**
	 * @param date
	 * @return string
	 */
	public static String getDay(Date date) {
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("dd");
		String cur_day = formater.format(date);
		return cur_day;
	}
	/**
	 * @param date
	 * @return string
	 */
	public static String getHour(Date date) {
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("HH");
		String cur_day = formater.format(date);
		return cur_day;
	}
	public static int getMinsFromDate(java.util.Date dt) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(dt);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		return ((hour * 60) + min);
	}
	/**
	 * Function to convert String to Date Object. If invalid input then current or next day date is
	 * returned (Added by Ali Naqvi on 2006-5-16).
	 * @param str String input in YYYY-MM-DD HH:MM[:SS] format.
	 * @param isExpiry boolean if set and input string is invalid then next day date is returned
	 * @return Date
	 */
	public static java.util.Date convertToDate(String str, boolean isExpiry) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		java.util.Date dt = null;
		try {
			dt = fmt.parse(str);
		} catch (ParseException ex) {
			Calendar cal = Calendar.getInstance();
			if (isExpiry) {
				cal.add(Calendar.DAY_OF_MONTH, 1);
				cal.set(Calendar.HOUR_OF_DAY, 23);
				cal.set(Calendar.MINUTE, 59);
			} else {
				cal.set(Calendar.HOUR_OF_DAY, 0);
				cal.set(Calendar.MINUTE, 0);
			}
			dt = cal.getTime();
		}
		return dt;
	}
	public static java.util.Date convertToDate(String str) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		java.util.Date dt = null;
		try {
			dt = fmt.parse(str);
		} catch (ParseException ex) {
			dt = new java.util.Date();
		}
		return dt;
	}
	public static String dateFromat(Date date, int minute) {
		String dateFormat = null;
		int year = Integer.parseInt(getYear(date));
		int month = Integer.parseInt(getMonth(date));
		int day = Integer.parseInt(getDay(date));
		int hour = minute / 60;
		int min = minute % 60;
		dateFormat = String.valueOf(year) + (month > 9 ? String.valueOf(month) : "0" + String.valueOf(month))
				+ (day > 9 ? String.valueOf(day) : "0" + String.valueOf(day)) + " "
				+ (hour > 9 ? String.valueOf(hour) : "0" + String.valueOf(hour))
				+ (min > 9 ? String.valueOf(min) : "0" + String.valueOf(min)) + "00";
		return dateFormat;
	}
	public static String sDateFormat() {
		return new SimpleDateFormat(DATE_PATTERN).format(Calendar.getInstance().getTime());
	}
	public static void main(String[] args) {
		System.out.println(getDays());
		System.out.println(getAfterDayWeek("3"));
	}
}
