package work.oop;

import java.util.Date;

public class Member_Test {
	
	 Member Members[] = new Member[10000];

	public static void main(String[] args) {
		
		Member Members[] = new Member[10000];
		
     //ȸ����ä ��ü������ �ʱ�ȭ ������ �̿� ��ü ����
	    Member m1 = new Member("user01","111","1111");
		
		//�Ϲ�ȭ�� ��ü������ �ʱ��� ������ �̿� Ĵü ����
	    GenneralMember g1 = new GenneralMember("user01","pass01","111",1000);
	 //	������ȸ����ü ��ü������ ��Űȭ ������ �̿� ��ü����
        AdminMember a1 = new AdminMember("user01","pass01","111","������","�ѹ���");
        Date today = new Date();
        
        method(m1);
        //method ȣ��
        
        for (int i = 0; i < Members.length; i++) {
			
		}
        
        
	}
	
	public static void method(Object obj) {
		// TODO Auto-generated method stub
        
        if (obj!= null &&obj instanceof AdminMember) {
        	AdminMember a2 = (AdminMember)obj;
            
		} else {
           System.out.println("Error: ����ȯ �̷������ �ʾҽ��ϴ�.");
		}
	}
}
