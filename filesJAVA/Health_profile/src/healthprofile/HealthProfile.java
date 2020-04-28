package healthprofile;

public class HealthProfile
{
	private String firstName;
	private String lastName;
	private String gender;
	private int dayOfBirth;
	private String monthOfBirth;
	private int yearOfBirth;
	private double height;
	private double weight;
	int currentYear=2017;
	private int maximumHeartrate;
	private int age;
	private double BMI;

	private void age()
	{
		int age=currentYear-yearOfBirth;
		System.out.println("Your age is "+age);
	}
	private void maximumHeartRate()
	{
		int maximumHeartRate=220-age;
		System.out.println("Your maximum heart rate is "+maximumHeartRate);
	}
	private void bmi()
	{
		double BMI=weight/height*height;
		System.out.println("Your Body Mass Index(BMI)is: "+BMI);
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getMonthOfBirth() {
		return monthOfBirth;
	}
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public int getMaximumHeartrate() {
		return maximumHeartrate;
	}
	public void setMaximumHeartrate(int maximumHeartrate) {
		this.maximumHeartrate = maximumHeartrate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
	

}