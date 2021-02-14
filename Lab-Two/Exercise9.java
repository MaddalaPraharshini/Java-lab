package com;
import java.time.LocalDate;
import java.time.Period;
public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2019, 2, 12);
	      LocalDate date2 = LocalDate.now();
	      Period p = Period.between(date1, date2);
	      System.out.println("Years (Difference) = "+p.getYears());
	      System.out.println("Month (Difference) = "+p.getMonths());
	      System.out.println("Days (Difference) = "+p.getDays());
		  
	}

}
