package work.datetype;

import java.util.ArrayList;
import java.util.Scanner;

public class PrcticeTest {


	
	// test


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCtrlClass gradeCtrl = new GradeCtrlClass();
		System.out.println("�л��� �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		int point = input.nextInt();
		ArrayList<PointAndGrade> arrayList = new ArrayList<>();
		PointAndGrade pointAndGrade = new PointAndGrade();
		
	//	System.out.println("��..........."+gradeCtrl.getGrade(point));
		
		for(int points:gradeCtrl.randomNumbers(point)){
			
			pointAndGrade.setPoint(points);
			pointAndGrade.setGrade(gradeCtrl.getGrade(points));
			System.out.print(pointAndGrade.toString());
			arrayList.add(pointAndGrade);
			System.out.println();
			
		}
		
		

	}
	
	
	

}
