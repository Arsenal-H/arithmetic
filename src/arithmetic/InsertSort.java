package arithmetic;

public class InsertSort {
	public static int count = 0;  

	public static void main(String[] args) {  

		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };  
		print(data);  
		insertSort(data);  
		print(data);  

	}  

	public static void insertSort(int[] data) {  
		for (int i = 1; i < data.length; i++) {  
			// ����i����Ԫ��ֵ  
			int tmp = data[i];  
			if (data[i] < data[i - 1]) {  
				int j = i - 1;  
				// �������һ��  
				while (j >= 0 && data[j] > tmp) {  
					data[j + 1] = data[j];  
					j--;  
				}  
				// ���tmp������ʵ�λ��  
				data[j + 1] = tmp;  
				print(data);  
			}  
		}  
	}  

	public static void print(int[] data) {  
		for (int i = 0; i < data.length; i++) {  
			System.out.print(data[i] + "\t");  
		}  
		System.out.println();  
	}  
}
