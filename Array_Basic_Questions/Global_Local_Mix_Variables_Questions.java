package Array_Basic_Questions;
public class Global_Local_Mix_Variables_Questions {
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
		System.out.println(val);
		int val=19;
		val = 120;
		System.out.println(val);
	}
}
