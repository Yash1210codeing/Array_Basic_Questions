package Array_Basic_Questions;
public class Two_Array_Merge_Sorted_Array_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr1= {3,5,7,9,11};
        int []arr2= {1,2,3,4,5,6,7};
        int[]ans=merge_twosorted_array(arr1,arr2);
        for(int i=0;i<ans.length;i++) {
        	System.out.print(ans[i]+" ");
        }
	}
	public static int[]merge_twosorted_array(int []arr1,int[]arr2){
		int n=arr1.length;
		int m=arr2.length;
		int[]ans=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n&&j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
