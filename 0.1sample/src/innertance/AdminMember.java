package innertance;

/**
 * 
 * 
 * 
 * @author ROOM1_3
 *ȭ��Ŭ����(Member)�� ��� ����
 *
 *���: grade
 *�μ�:department 
 *����ó==> �θ�
 */


public class AdminMember extends Member  {

	private String grade;
	private String deparment;
	public AdminMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminMember(String userId, String userPw, String userName) {
		super(userId, userPw, userName);
		
	}
	public AdminMember(String userId, String userPw, String userName,String grade, String deparment) {
		this(userId, userPw, userName);
		this.grade = grade;
		this.deparment= deparment;
	}
	
	
}
