package work.interface_ex;

public class AbstrackTest {

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
abstract class Service{
	String title = "공지관리시스템";
	
	//인턴스 메서드 : 중북정의
	public void printTitel(){
		System.out.println(title);
	}
	//인스턴스 메서드: 중북정의
	public void printTitel(String title){
		System.out.println(title);
	}
	//추상 메서드: 
	public abstract void 셋트(Object obj);
}

class NoticeService extends Service{

	@Override
	public void 셋트(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("게시판변경완료");
	}
}
	class BoardService extends Service{

		@Override
		public void 셋트(Object obj) {
			// TODO Auto-generated method stub
			System.out.println("게시판변경완료");
		}
	

}
