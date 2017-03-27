package work.oop;

import java.util.Date;

public class Member_Test {
	
	 Member Members[] = new Member[10000];

	public static void main(String[] args) {
		
		Member Members[] = new Member[10000];
		
     //회원객채 전체데이터 초기화 생성자 이용 객체 생성
	    Member m1 = new Member("user01","111","1111");
		
		//일반화원 진체데이터 초기하 생성자 이용 캑체 생성
	    GenneralMember g1 = new GenneralMember("user01","pass01","111",1000);
	 //	관리자회원객체 진체데이터 초키화 생성자 이용 객체생성
        AdminMember a1 = new AdminMember("user01","pass01","111","관리자","총무팀");
        Date today = new Date();
        
        method(m1);
        //method 호출
        
        for (int i = 0; i < Members.length; i++) {
			
		}
        
        
	}
	
	public static void method(Object obj) {
		// TODO Auto-generated method stub
        
        if (obj!= null &&obj instanceof AdminMember) {
        	AdminMember a2 = (AdminMember)obj;
            
		} else {
           System.out.println("Error: 형변환 이루어지지 않았습니다.");
		}
	}
}
