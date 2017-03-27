package work.datetype;

public class PointAndGrade {

	private int point;
	private String grade;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PointAndGrade [point=" + point + ", grade=" + grade + "]";
	}

}
