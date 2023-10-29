package test.model;

import org.openqa.selenium.WebDriver;

public class FormData {
	public String firstName; 
	public String lastName; 
	public String userEmail; 
	public String inputGender; 
	public  String sdt; 
	public  String inputDay; 
	public  String inputMonth; 
	public  String inputYear; 
	public  String subjects; 
	public  String inputCheckbox1; 
	public  String inputCheckbox2; 
	public String address; 
	public  String stage; 
	public  String city; 


	
	public FormData(String firstName, String lastName, String userEmail, String inputGender, String sdt,
			String inputDay, String inputMonth, String inputYear, String subjects, String inputCheckbox1,
			String inputCheckbox2, String address, String stage, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.inputGender = inputGender;
		this.sdt = sdt;
		this.inputDay = inputDay;
		this.inputMonth = inputMonth;
		this.inputYear = inputYear;
		this.subjects = subjects;
		this.inputCheckbox1 = inputCheckbox1;
		this.inputCheckbox2 = inputCheckbox2;
		this.address = address;
		this.stage = stage;
		this.city = city;
	}
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
