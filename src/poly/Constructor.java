package poly;

public class Constructor {

	public static void main(String[] args) {
		Good obj = new Good();
		obj.Village();
		Good obj1 = new Good(10, 20);

	}

}
class Good{
	Good(){
		System.out.println("This is constructor");
	}
	Good(int a, int b){
		System.out.println("result of value is:" +(a+b));
	}
		public void Village() {
			System.out.println("srikakulam");
			
		}
}