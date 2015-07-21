package test;

public class ShellSort {
	public static void sort(int[] arr){
		int tmp;
		int key = 2;
		for(int i = 0; i < arr.length; i=i+key){
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
}
