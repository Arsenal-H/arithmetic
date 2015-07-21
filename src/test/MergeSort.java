package test;

public class MergeSort {
	private static int[] tmpArr;
	public static void sort(int[] arr, int left, int center, int last){
		int tmp = left , right = center+1;
		int start = left;
		int length = last - left + 1;
		while(left <= center && right <= last){
			if(arr[left] <= arr[right]){
				tmpArr[tmp] = arr[left];
				left++;
				tmp++;
			}
			if(arr[left] > arr[right]){
				tmpArr[tmp] = arr[right];
				right++;
				tmp++;
			}
		}
		while(left <= center){
			tmpArr[tmp] = arr[left];
			left++;
			tmp++;
		}
		while(right <= last){
			tmpArr[tmp] = arr[right];
			right++;
			tmp++;
		}
		for(int i = length ; i > 0; i--){
			arr[start] = tmpArr[start++];
		}
	}
	public static void merge(int[] arr,int left,int right){
		int center = (left + right)/2;
		if(left < right){
			merge(arr,left,center);
			merge(arr,center+1,right);
			sort(arr,left,center,right);
		}
		
		
	}
	public static void main(String[] args){
		int arr[] = {5,9,8,3,6,4};
		tmpArr = new int[arr.length];
		merge(arr,0,5);
		for(int a : arr)
			System.out.println(a);
	}
}
