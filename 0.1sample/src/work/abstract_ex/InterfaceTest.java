package work.abstract_ex;

public class InterfaceTest {

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
interface Service{
	
	// �������̽� �� ��� ��  
	String title = "���������ý���";
	
	//���Ͻ� �޼��� : �ߺ�����
	public void printTitel();
	//�ν��Ͻ� �޼���: �ߺ�����
	public void printTitel(String title);
	//�߻� �޼���: 
	public abstract void ��Ʈ(Object obj);
	
	
	
	
}

class NoticeService implements Service{

	@Override
	public void ��Ʈ(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��Ǻ���Ϸ�");
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
		public void ��Ʈ(Object obj) {
			// TODO Auto-generated method stub
			System.out.println("�Խ��Ǻ���Ϸ�");
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
