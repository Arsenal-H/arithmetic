package test;

public class QuickSort {
	public static void sort(int[] arr,int i,int j){
		int tem = arr[i] ,left = i ,right = j,center;
		while(i < j){
			while(tem < arr[j] && j > i)
				j--;
			arr[i] = arr[j];
			while(tem > arr[i] && i < j)
				i++;
			arr[j] = arr[i];
		}
		arr[i] = tem;
		center = i;
		if(left < right){
			sort(arr ,left , center - 1);
			sort(arr ,center + 1 , right);
		}

	}
	public static void main(String[] args){
		int[] arr = {5,6,2,3,1,8,9};
		sort(arr,0,6);
		for(int a : arr)
			System.out.println(a);
	}
}
