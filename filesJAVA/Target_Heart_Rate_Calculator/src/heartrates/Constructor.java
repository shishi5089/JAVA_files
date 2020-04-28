package heartrates;

public class Constructor 
{
	 private String firstName;
	 private String lastName;
	 private int yearOfBirth;
	 private int dateOfBirth;
	 private String monthOfBirth;
	int  Heartrate;
	
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getHeartrate() {
		return Heartrate;
	}
	public void setHeartrate(int heartrate) {
		Heartrate = heartrate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int i) {
		this.yearOfBirth = i;
	}
	public int getdateOfBirth() {
		return dateOfBirth;
	}
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	
}
