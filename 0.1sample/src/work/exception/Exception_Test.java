package work.exception;

import java.sql.SQLException;

public class Exception_Test {

	public static void main(String[] args) {

		String[] names = new String[] { "ȫ��", "����", "������" };

		for (int i = 0; i < 5; i++) {
			try {
				
				if (true) {
				//	throw new NullPointerException("���� �Ϻη� null ���ܹ߻���Ŵ");
					
					throw new ClassCastException("DB");
				}
				
				System.out.println(names[i]);
                //�迭���� ����: ArrayI
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ܸ޼���" + e.getMessage());
				System.out.println("����Ŭ�����̸�" + e.getClass().getName());
				//�ݺ��� ������
				//break;
				
				//�ý��� ����, finally ���� ����
				//System.exit(1);
				
				
			} finally {
				// ����ó��, ���ܹ߻��� ����Ǵ� ����
				// ��, 2������ ��쿡�� ������� ���� �� ����
				// 1.finally ó���� ���ܹ߻�
				// 2.catch ó���κп��� System.exit(int) ���α׷� ���������
				System.out.println("�ݵ�� ����Ǵ� �����Դϴ�");
			}

			System.out.println("��������Ǿ����ϴ�.");

		}
	}
}
