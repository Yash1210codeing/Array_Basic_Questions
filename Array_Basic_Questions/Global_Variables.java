package Array_Basic_Questions;

public class Global_Variables {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hekko");
		int x = 60;
		System.out.println(val);
		fun(x);
		System.out.println(val);
	}

	public static void fun(int x) {
		int a = 90;
		System.out.println(x);
		val = 120;
		System.out.println(val);
	}
}
