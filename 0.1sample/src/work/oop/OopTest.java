package work.oop;

public class OopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Object obj1 = new Object();
       Object obj2 = new Object();
       Object obj3 = obj2;
       //toString
       System.out.println();
       System.out.println("obj1"+obj1);
       System.out.println("obj2"+obj2);
       System.out.println("obj3"+obj3);
       
       
       System.out.println();
       System.out.println("obj1"+obj1.toString());
       System.out.println("obj2"+obj2.toString());
       System.out.println("obj3"+obj3.toString());
       
       System.out.println();
       System.out.println(obj1.equals(obj2));
       System.out.println(obj2.equals(obj3));
       System.out.println(obj1.equals(obj3));
       
       System.out.println();
       String name1 = "ȫ�浿";
       String name2 = new String("ȫ�浿");
       String name3 = name2;
       
       System.out.println(name1.hashCode());
       System.out.println(name2.hashCode());
       System.out.println(name3.hashCode());
       
       System.out.println();
       GenneralMember g1 = new GenneralMember("user01", "01", "ȫ�浿", 1000);
       GenneralMember g2 = new GenneralMember("user01", "01", "ȫ�浿", 1000);
       
       GenneralMember g3 = new GenneralMember("user02", "01", "ȫ�浿", 1000);
       
       
       System.out.println(g1.toString());
       System.out.println(g2.toString());
       System.out.println(g3.toString());
	}

}
