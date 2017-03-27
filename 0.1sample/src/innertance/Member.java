package innertance;

/**
 * 회원들의 공통 기능으로 일반화시킨 부모 클래스
 * 
 * @author ROOM1_3 --설계규칙 1.encapsulation ==회원들 공통 속성 
 * --아이디 비밀번호 이름 
 * userId, userPw, userName
 */

public class Member {
	private String userId;
	private String userPw;
	private String userName;

	public Member() {
		// TODO Auto-generated constructor stub
		System.out.println("부모클래스 생성자");
	}

	public Member(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		System.out.println("부모클래스 생성자");
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
