package work.oop;

/**
 * 
 * ȭ��Ŭ����(Member)�� ��ӹ��� �ڽ�Ŭ����(sub)
 * @author ROOM1_3
 *
 */

public class GenneralMember extends Member{
	
	/** **/
	private int mileage;
	
  /**
   * 
   * �⺻������
   */
	public GenneralMember() {
		// TODO Auto-generated constructor stub
		System.out.println("�Ϲ�ȸ�� �⺻������ ����");
	}
	
	

public GenneralMember(String userId, String userPw, String userName,int mileage) {
	super(userId, userPw, userName);
	// TODO Auto-generated constructor stub
	this.mileage= mileage;
	System.out.println("�Ϲ�ȸ�� �⺻������ ����");
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
