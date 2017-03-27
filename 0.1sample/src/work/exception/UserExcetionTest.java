package work.exception;

public class UserExcetionTest {

	public String[] 이름 = {"ㅇㅇ","ㅏㅏ","222"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UserExcetionTest excetionTest = new UserExcetionTest();
       try {
		excetionTest.isExist("ddd");
		excetionTest.isExist("222");
	} catch (DuplicateException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
       System.out.println("dddddd");
	}
	
	public void isExist(String name) throws DuplicateException {
		for (int i = 0; i < 이름.length; i++) {
			if (이름[i].equals(name)) {
				throw new DuplicateException(name);
			}
		}
	}

}
