package Array_Basic_Questions;
public class Maximum_Array_Questions_Method_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 5, 4, 11, 7 };
		System.out.println(max(arr));
	}
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE; // -2^31-
		// Integer.MAX_VALUE // 2^31-1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
