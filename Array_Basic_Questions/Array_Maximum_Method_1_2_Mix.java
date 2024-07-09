package Array_Basic_Questions;
public class Array_Maximum_Method_1_2_Mix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {2,3,1,51,7};
        System.out.println(max(arr));
        //System.out.println(max_2(arr));
	}
	public static int max(int[]arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];				
			}
		}
		return max;
	//}
//	public static int max_2(int[]arr) {
//		int max=Integer.MIN_VALUE;
//		for (int i=0;i<arr.length;i++) {
//			max=Math.max(arr[i],max);			
//		}
//		return max;		
	}
}
