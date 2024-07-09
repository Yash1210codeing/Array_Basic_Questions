package Array_Basic_Questions;
public class Swap_Local_Variable_Refrence_Change {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {10,20,30,40,50};
        int []brr= {100,200,300,400,600};
        System.out.println(arr[0]+" "+brr[0]);
        swap(arr,brr);
        System.out.println(arr[0]+" "+brr[0]);
        
	}
	public static void swap(int[]arr,int[]brr) {
		int[]temp=arr;
		arr=brr;
		brr=temp;
	}
}
