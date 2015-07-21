package test;

public class InsertSort {
	public static void sort(int[] arr){
		int tmp;
		for(int i = 0; i < arr.length; i++){
			int j = i;
			while(j > 1){
				if(arr[j] < arr[j-1]){
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					j--;
				}else{
					break;
				}
			}
		}
	}
	public static void main(String[] args){
		int arr[] = {1, 5, 6, 9, 3, 2};
		sort(arr);
		for(int n: arr){
			System.out.println(n);
		}
	}
}
