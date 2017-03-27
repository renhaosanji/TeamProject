package work.datetype;

public class LotteEmployeeDataType extends EmployeeDataTypeCom {
	
	
	int currentTime;
	boolean groupEducation;



	public LotteEmployeeDataType(String employeeName, int age, String department, String brithday, float length,
			char gender, boolean working, int currentTime, boolean groupEducation) {
		super(employeeName, age, department, brithday, length, gender, working);
		this.currentTime = currentTime;
		this.groupEducation = groupEducation;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public boolean isGroupEducation() {
		return groupEducation;
	}

	public void setGroupEducation(boolean groupEducation) {
		this.groupEducation = groupEducation;
	}

	@Override
	public String toString() {
		return "LotteEmployeeDataType [currentTime=" + currentTime + ", groupEducation=" + groupEducation
				+ ", employeeName=" + employeeName + ", age=" + age + ", department=" + department + ", brithday="
				+ brithday + ", length=" + length + ", gender=" + gender + ", working=" + working + "]";
	}

	
    
	
	
	
}
