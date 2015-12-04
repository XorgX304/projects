public class HelloWorldTen{

	public static void main(String[] args){

		String msg = String.format("Hello, %s", args[0]);

		for (int count = 10; count > 0; count--){
			System.out.println(msg);
		}
	}
}
