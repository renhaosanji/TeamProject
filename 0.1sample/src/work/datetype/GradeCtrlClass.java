package work.datetype;

import java.util.LinkedList;

public class GradeCtrlClass implements GradeMethod {

	@Override
	public String getGrade(int point) {
		String Grade=null;
		
	    if (point>90 && point<=100) {
			Grade="대박짱이다";
		} else if(point>80 && point<=90) {
			Grade="잘했네";
		}else if(point>70 && point<=80) {
			Grade="그저그래";
		}else if(point>60 && point<=70) {
			Grade="금찍하다";
		}else {
			Grade="내일부터 오지마세요";
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
