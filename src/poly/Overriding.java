package poly;

class A{
		public void name() {
			System.out.println("print A");
		}
	}
	class B extends A{
		public void name1() {
			super.name();
		}
		@Override
		public void name() {
			System.out.println("print B");
		}
	}
	public class Overriding extends B {
		
	public static void main(String[] args) {
		Overriding obj = new Overriding();
	     obj.name();
	     obj.name1();

	}

	}
