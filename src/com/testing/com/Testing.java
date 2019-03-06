package com.testing.com;

import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Testing {
	
	public static void main(String[] args) {
		
		String fecha = formatLastAccessDate("2016-04-20T12:24:09.000-05:00", "1");
		
		System.out.println(fecha);
		
	}
	
	public static String formatLastAccessDate(String date, String lang){
        String value = date;
		String [] engMonths = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] spanishMonths = {"", "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        String modDate =  value.substring(0, 10);
        String modDate1 = value.substring(11, 19);
        String finalDateString="";
        DateFormat modDateFormat = new SimpleDateFormat("yyyy-MM-dd");
          try {
              Date date2 = modDateFormat.parse(modDate);                  
              String findDate = date2.toString();
              int month = date2.getMonth() + 1;
              String mon;
              if ("2".equals(lang))
  			  {
            	  mon = engMonths[month];
  			  }
  			  else
  			  {
  				mon = spanishMonths[month];
  			  }
              String day = (date2.getDate() < 10) ? ("0" + Integer.toString(date2.getDate())) : (Integer.toString(date2.getDate()));
              String initialDate = day+" "+mon;             
              String s2 = findDate.substring(23,28);                
              finalDateString = initialDate+s2+" "+modDate1;                                 
          } catch (ParseException e) {                  
              e.printStackTrace();
        }  
       return finalDateString;
    }

}
