package work.datetype;

import java.util.LinkedList;

public class GradeCtrlClass implements GradeMethod {

	@Override
	public String getGrade(int point) {
		String Grade=null;
		
	    if (point>90 && point<=100) {
			Grade="���¯�̴�";
		} else if(point>80 && point<=90) {
			Grade="���߳�";
		}else if(point>70 && point<=80) {
			Grade="�����׷�";
		}else if(point>60 && point<=70) {
			Grade="�����ϴ�";
		}else {
			Grade="���Ϻ��� ����������";
		}
		
		
		return Grade;
	}

	@Override
	public int randomNumber() {
		
		return (int) (Math.random()*100+1) ;
	}

	@Override
	public LinkedList<Integer> randomNumbers(int counter) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<>();
		for (int i = 0; i <counter; i++) {
			
			numbers.add(randomNumber());
			
		}
		
		return numbers;
	}
	
	
	
}
