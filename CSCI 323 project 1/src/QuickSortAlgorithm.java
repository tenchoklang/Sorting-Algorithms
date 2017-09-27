

public class QuickSortAlgorithm extends FileIO {

	public int[] QuickSort(int[] A){
		QuickSortFunction(A,0,A.length-1);
		
		return A;
	}
	
	private void QuickSortFunction(int[] A, int low, int high){
		
		if(low<high){//kind of like the condition to check for base case
			int partition = Partition(A,low,high);
			QuickSortFunction(A,low,partition-1);
			QuickSortFunction(A, partition+1, high);
		}
	}
	
	private int Partition(int[] A, int low,int high){//
		int Pivot = A[high];//everthing to the left has to be smaller, everything to the right has to be bigger
		int i = low-1;
		
		for(int j=low;j<high;j++){
			count++;
			if(A[j]<= Pivot){
				i++;
				swap(A,i,j);//swap the values if A[j]<= value of partition
			}
		}
		swap(A, i+1, high);
		return i+1;//returns value of partition	
	}
	
	private void swap(int A[], int i, int j){
		int temp = A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}