package work.datetype;

public abstract class EmployeeDataTypeCom {

	String employeeName;
	int age;
	String department;
	String brithday;
	float length;
	char gender;
	boolean working;

	
	
	
	public EmployeeDataTypeCom(String employeeName, int age, String department, String brithday, float length,
			char gender, boolean working) {
		super();
		this.employeeName = employeeName;
		this.age = age;
		this.department = department;
		this.brithday = brithday;
		this.length = length;
		this.gender = gender;
		this.working = working;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBrithday() {
		return brithday;
	}

	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return "EmployeeDataTypeCom [employeeName=" + employeeName + ", age=" + age + ", department=" + department
				+ ", brithday=" + brithday + ", length=" + length + ", gender=" + gender + ", working=" + working + "]";
	}
	
	

}
