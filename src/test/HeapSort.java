package test;

public class HeapSort {
	public static void sort(int[] data){
		int i = 0, center = data.length / 2 - 1;
		int tmp;
		while(i <= center){
			if(i*2+2 >= data.length){
				if(data[i*2+1] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+1];
					data[i*2+1] = tmp;
					int j = i;
					while((j - 1) / 2 >= 0){
						if(data[j] < data[(j - 1) / 2]){
							tmp = data[j];
							data[j] = data[(j-2)/2];
							data[(j-1)/2] = tmp;
							j = (j-1)/2;
						}
						else{
							break;
						}
					}
				}else{
					break;
				}
			}else{
				if(data[i*2+1] <= data[i*2+2] && data[i*2+1] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+1];
					data[i*2+1] = tmp;
					int j = i;
					while((j - 1) / 2 >= 0){
						if(data[j] < data[(j - 1) / 2]){
							tmp = data[j];
							data[j] = data[(j-2)/2];
							data[(j-1)/2] = tmp;
							j = (j-1)/2;
						}
						else{
							break;
						}
					}
				}
				if(data[i*2+1] > data[i*2+2] && data[i*2+2] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+2];
					data[i*2+2] = tmp;
					int j = i;
					while((j - 1) / 2 >= 0){
						if(data[j] < data[(j - 1) / 2]){
							tmp = data[j];
							data[j] = data[(j-2)/2];
							data[(j-1)/2] = tmp;
							j = (j-1)/2;
						}
						else{
							break;
						}
					}
				}
			}
			i++;
		}
		for(int n : data)
			System.out.println(n);
		System.out.println("--------");
		tmp = data[0];
		data[0] = data[data.length - 1];
		data[data.length - 1] = tmp;
		sort2(data,data.length-1);
	}
	public static void sort2(int[] data,int last){
		int i = 0,center = last / 2 - 1;
		int tmp;
		while(i <= center){
			if(i*2+2 >= last){
				if(data[i*2+1] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+1];
					data[i*2+1] = tmp;
					i = i*2+1;
				}
				else{
					break;
				}
			}else{
				if(data[i*2+1] <= data[i*2+2] && data[i*2+1] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+1];
					data[i*2+1] = tmp;
					i = i*2+1;
					continue;
				}
				if(data[i*2+1] > data[i*2+2] && data[i*2+2] < data[i]){
					tmp = data[i];
					data[i] = data[i*2+2];
					data[i*2+2] = tmp;
					i = i*2+2;
				}
				else{
					break;
				}
			}
		}
		tmp = data[0];
		data[0] = data[last-1];
		data[last-1] = tmp;
		if(last > 1){
			sort2(data,last-1);
		}
	}
	public static void main(String[] args){
		int[] arr = { 5 , 4 , 2 , 15 , 19 , 1 ,8 ,9 , 8};
		sort(arr);
		for(int n : arr)
			System.out.println(n);
	}
}
