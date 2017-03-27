package work.abstract_ex;

public class InterfaceTest {

	public static void main(String[] args) {
		
		
		//추상클래스 부모타입의 변수로 사용 가능:다형성
	   Service[] services = new Service[3];
	   services[0] = new NoticeService();
	   services[1] = new NoticeService();
	   services[2] = new BoardService();
	   
	   for(Service s:services){
		   System.out.println(s);
	   }
	}
	
  

}
interface Service{
	
	// 인터페이스 될 상수 됨  
	String title = "공지관리시스템";
	
	//인턴스 메서드 : 중북정의
	public void printTitel();
	//인스턴스 메서드: 중북정의
	public void printTitel(String title);
	//추상 메서드: 
	public abstract void 셋트(Object obj);
	
	
	
	
}

class NoticeService implements Service{

	@Override
	public void 셋트(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("게시판변경완료");
	}

	@Override
	public void printTitel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printTitel(String title) {
		// TODO Auto-generated method stub
		
	}
}
	class BoardService implements Service{

		@Override
		public void 셋트(Object obj) {
			// TODO Auto-generated method stub
			System.out.println("게시판변경완료");
		}

		@Override
		public void printTitel() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void printTitel(String title) {
			// TODO Auto-generated method stub
			
		}
	

}
