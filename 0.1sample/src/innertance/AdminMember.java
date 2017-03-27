package innertance;

/**
 * 
 * 
 * 
 * @author ROOM1_3
 *화원클래스(Member)를 상속 받음
 *
 *등급: grade
 *부서:department 
 *연락처==> 부모
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
