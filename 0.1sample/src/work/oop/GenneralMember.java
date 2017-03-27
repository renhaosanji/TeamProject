package work.oop;

/**
 * 
 * 화원클래스(Member)를 상속받은 자식클래스(sub)
 * @author ROOM1_3
 *
 */

public class GenneralMember extends Member{
	
	/** **/
	private int mileage;
	
  /**
   * 
   * 기본생성자
   */
	public GenneralMember() {
		// TODO Auto-generated constructor stub
		System.out.println("일반회원 기본생성자 수행");
	}
	
	

public GenneralMember(String userId, String userPw, String userName,int mileage) {
	super(userId, userPw, userName);
	// TODO Auto-generated constructor stub
	this.mileage= mileage;
	System.out.println("일반회원 기본생성자 수행");
}



public int getMileage() {
	return mileage;
}

public void setMileage(int mileage) {
	this.mileage = mileage;
}



@Override
public String toString() {
	
	return super.toString() +","+mileage;
}


}
