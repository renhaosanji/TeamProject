package work.interface_ex;

public class AbstrackTest {

	public static void main(String[] args) {
		
		
		//�߻�Ŭ���� �θ�Ÿ���� ������ ��� ����:������
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
	String title = "���������ý���";
	
	//���Ͻ� �޼��� : �ߺ�����
	public void printTitel(){
		System.out.println(title);
	}
	//�ν��Ͻ� �޼���: �ߺ�����
	public void printTitel(String title){
		System.out.println(title);
	}
	//�߻� �޼���: 
	public abstract void ��Ʈ(Object obj);
}

class NoticeService extends Service{

	@Override
	public void ��Ʈ(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��Ǻ���Ϸ�");
	}
}
	class BoardService extends Service{

		@Override
		public void ��Ʈ(Object obj) {
			// TODO Auto-generated method stub
			System.out.println("�Խ��Ǻ���Ϸ�");
		}
	

}
