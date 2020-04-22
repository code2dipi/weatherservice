package com.dipi.weatherservice.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DataUtils {
	
	  // The date formatter
    // - dd:   day in month (number)
    // - MM:   month in year (number)
    // - yyyy: year
    //
    // See this link for details: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html
    //
    //
	
	
	private static SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static Date parseDate(String dateStr) throws ParseException {
		Date theDate=formatter.parse(dateStr);
		return theDate;
	}
	//read a date and format/convert to a string
	public static String formatDate(LocalDateTime theDate) {
		String result=null;
		if(theDate!=null) {
		   result=formatter.format(theDate);
		}
		return result;
	}

}
