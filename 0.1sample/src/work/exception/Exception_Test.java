package work.exception;

import java.sql.SQLException;

public class Exception_Test {

	public static void main(String[] args) {

		String[] names = new String[] { "홍기", "강강", "유관손" };

		for (int i = 0; i < 5; i++) {
			try {
				
				if (true) {
				//	throw new NullPointerException("내가 일부로 null 예외발생시킴");
					
					throw new ClassCastException("DB");
				}
				
				System.out.println(names[i]);
                //배열관련 예외: ArrayI
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외메세지" + e.getMessage());
				System.out.println("예외클래스이름" + e.getClass().getName());
				//반복문 나가기
				//break;
				
				//시스템 중지, finally 수행 안함
				//System.exit(1);
				
				
			} finally {
				// 정사처리, 예외발생시 수행되는 구문
				// 딘, 2가지의 경우에는 수행되지 않을 수 있음
				// 1.finally 처리중 예외발생
				// 2.catch 처리부분에서 System.exit(int) 프로그램 강제종료시
				System.out.println("반드시 수행되는 로직입니다");
			}

			System.out.println("정상종료되었습니다.");

		}
	}
}
