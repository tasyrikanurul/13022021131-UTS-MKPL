package lib;

public class Employee extends Family {
	private enum Gender {
		Pria,
		Wanita,
	}

	private Date timeJoined;

	private String employeeId;
	private String firstName;
	private String lastName; 
	private String address;

	private Gender gender;
	private boolean isForeigner;

	
	public Date gettimeJoined() {
		return timeJoined;
	}

	public void settimeJoined(Date timeJoined){
		this.timeJoined = timeJoined;
	}

	public String getemployeeId() {
		return employeeId;
	}

	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public Gender getgender() {
		return gender;
	}

	public void setgender(Gender gender) {
		this.gender = gender;
	}

	public boolean getisForeigner() {
		return isForeigner;
	}

	public void setisForeigner(boolean isForeigner) {
		this.isForeigner = isForeigner;
	}
	
}




