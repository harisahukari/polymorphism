package poly;

public class Overloading {
	
	public void loading(String name) {
		System.out.println("Name :"+name);
	}
	public void loading(int age) {
		System.out.println("Age :"+age);
	}
	public void loading(String name,int age) {
		System.out.println("Name :"+name+ "\n"+"Age :"+age);
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		   obj.loading("siva");
		   obj.loading(24);
		   obj.loading("hari",26);
	}

}
