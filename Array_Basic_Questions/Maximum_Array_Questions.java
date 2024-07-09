package Array_Basic_Questions;
public class Maximum_Array_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {1,4,2,6,10,5,7};
        System.out.println(max(arr));
	}
	public static int max(int[]arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
		}
	}
		return max;
	}
}
