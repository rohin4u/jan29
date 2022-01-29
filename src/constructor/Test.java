package constructor;

public class Test {

	public static void main(String[] args) {
		
		
		Animal a = Dog::new;
		
//		a.dog();
		
		Dog dog = a.dog(10);
		int m1 = dog.m1();
		System.out.println(m1);
		

	}

}
