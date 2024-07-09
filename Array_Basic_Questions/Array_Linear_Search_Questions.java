package Array_Basic_Questions;
public class Array_Linear_Search_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, -4 };
		int element = 6;
		//int ans=elementindexsearch(arr, element);
		//System.out.print(ans);
		System.out.println(elementindexsearch(arr, element));
	}
	public static int elementindexsearch(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
