package EmployeeManagement02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class StoreEmployee {
	
	private String name; 
	private String jobRank; 
	private int monthSalary;
	private int hourlyWage;
	private int workTime;
	private String joinDay;
	
	public int getMonthSalary() {
		monthSalary = hourlyWage * workTime;
		return monthSalary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobRank() throws ParseException {
//		LocalDate startDate = LocalDate.parse(joinDay, DateTimeFormatter.ISO_DATE);
//		LocalDate endDate = LocalDate.now();
		
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	      
	      Date startDate = sdf.parse(this.joinDay); 
	      Date endDate = new Date(System.currentTimeMillis());
	      

//		long Days = ChronoUnit.DAYS.between(startDate, endDate);
		  long Days = endDate.getTime() - startDate.getTime();
		  System.out.println(Days);
		  
		if (Days <= 150) {
		 this.jobRank = "newbie";
				 }
		else if (Days > 150) {
			this.jobRank = "manager";
		}
		return jobRank;
	}

	public void setJobRank(String jobRank) {
		this.jobRank = jobRank;
	}


	public int getHourlyWage() {
		if (jobRank=="junior") {
			this.hourlyWage = 10000;
		}
		else if (jobRank=="senior") {
			this.hourlyWage = 15000;
		}
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public void setMonthSalary(int monthSalary) {
		monthSalary = hourlyWage * workTime;
		this.monthSalary = monthSalary;
	}
	public void setJoinDay(String joinDay) {
		this.joinDay = joinDay;
	}
	public CharSequence getJoinDay() {
		return joinDay;
	}



}
