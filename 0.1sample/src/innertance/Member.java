package innertance;

/**
 * ȸ������ ���� ������� �Ϲ�ȭ��Ų �θ� Ŭ����
 * 
 * @author ROOM1_3 --�����Ģ 1.encapsulation ==ȸ���� ���� �Ӽ� 
 * --���̵� ��й�ȣ �̸� 
 * userId, userPw, userName
 */

public class Member {
	private String userId;
	private String userPw;
	private String userName;

	public Member() {
		// TODO Auto-generated constructor stub
		System.out.println("�θ�Ŭ���� ������");
	}

	public Member(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		System.out.println("�θ�Ŭ���� ������");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
