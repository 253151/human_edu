package EmployeeManagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data extends Employee{
	
	public Data(String name, int joinD, int workD, int workT) {
		super(name, joinD, workD, workT);
	}
	int payment;
	int hWage;	// 시급
	int i = 0;
	private CharSequence joinD;
	
	public int dD() {
		LocalDate startDate = LocalDate.parse(joinD, DateTimeFormatter.ISO_DATE);
		LocalDate endDate = LocalDate.now();

		long Days = ChronoUnit.DAYS.between(startDate, endDate);

		return (int) Days;		
	}
	
	public int Pay(int payment) {
		this.payment = payment;
		
		if (dD > 0 && dD < 150) {
			hWage = 9500;
			for (i=0; i==workT; i++) {
				payment = hWage * i;
				
			}
		}
		else if (dD >= 150) {
			hWage = 10500;
			for (i=0; i==workT; i++) {
				payment = hWage * i;
			}
		}
		else if (dD >= 300) {
			hWage = 12000;
			for (i=0; i==workT; i++) {
				payment = hWage * i;
			}
		}
		System.out.println("이달의 월급은"+payment+"원입니다.");
		return payment;
	}


}
