package com.systex.hr.main;

import com.systex.hr.model.Accountant;
import com.systex.hr.model.Director;
import com.systex.hr.model.Employee;
import com.systex.hr.model.Engineer;
import com.systex.hr.model.Manager;
import com.systex.hr.model.Secretary;
import com.systex.hr.service.StaffService;

public class HRMain {

	public static void main(String[] args) {
		Engineer e1 = new Engineer("Kevin", "290457832", "Taipei", "M", "CRM");
		Engineer e2 = new Engineer("Mary", "21457832", "Taipei", "M", "CRM");
		Engineer e3 = new Engineer("Gary", "297806754", "Taoyuan", "M", "HR");
		Manager m1 = new Manager("Richard", "3248953209", "Taipei", "M", "IT");
		Manager m2 = new Manager("David", "3248953209", "Taipei", "M", "IT");
		Accountant a1 = new Accountant("Robaca", "3248953209", "Taipei", "M", "IT");
		Director d1 = new Director("Feiona", "3248953209", "Taipei", "M", "IT");
		Secretary s1 = new Secretary("Rosalia", "3248953209", "Taipei", "M", "IT");
		
		Employee[] staff = {e1, e2, e3, m1, m2, a1, d1, s1};
		StaffService service = new StaffService();
		System.out.println("員工報表");
		System.out.println("================================");
		System.out.println("姓名\t電話\t地址\t性別\tMisc");
		System.out.println("================================");
		service.generateReport(staff);
		System.out.println("================================");
		System.out.println("薪資總額="+service.calcAllSalary(staff));
		
	}
}
