package test1;

public class abc { //테스트용
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = {64,34,25,12,22,11,90};
		
		System.out.println("정렬 전 배열:");
		for(int num=0;num<data.length;num++) {
			System.out.print(data[num] + " ");
		}
		System.out.println();
		
		bubbleSort(data);
		
		System.out.println("정렬 후 배열:");
		for(int num=0;num<data.length;num++) {
			System.out.print(data[num] + " ");
		}
	}
}
