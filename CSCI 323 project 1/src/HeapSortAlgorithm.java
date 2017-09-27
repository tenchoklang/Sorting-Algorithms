
public class HeapSortAlgorithm extends FileIO {

	private int HeapSize;
	
	public int[] Sort(int[] A){
		Build_Max_Heap(A);
		
		for(int i = HeapSize; i>0; i--){//
			swap(A, 0, i);//swap max with last value
			HeapSize--;//decrease array size to exclude the max
			Max_Heapify(A,0);//used to keep heap balance property after max swap
		}
		return A;
	}
	
	private void Max_Heapify(int[]A, int parent){//makes the heap to satisfy the max heap property, 
		
		int LeftChildIndex = 2*parent+1;//left child index
		int RightChildIndex = 2*parent+2;//right child index
		int LargerValue;
		
		if(LeftChildIndex <= HeapSize && A[LeftChildIndex] > A[parent]){//if leftchild index is within array and leftchild > parent
			LargerValue = LeftChildIndex;
		}else{
			LargerValue = parent;
		}
		
		if(RightChildIndex <= HeapSize && A[RightChildIndex] > A[LargerValue]){//if rightchildindex is within array and rightchild>largervalue
			LargerValue = RightChildIndex;
		}
		
		if(LargerValue != parent){//if largervalue is the same as parent else, stops recursion if they are equal
			swap(A,parent, LargerValue);
			count++;
			Max_Heapify(A, LargerValue);
		}	
	}
	
	private void Build_Max_Heap(int [] A){//builds the heap so it satisfies the max heap property
		HeapSize = A.length-1;
		
		for(int i = (A.length/2)-1; i>=0;i--){//finds all the parents and compares with their children
			Max_Heapify(A,i);
		}
	}
	
	private void swap(int[] A, int parent, int largestValue){//swaps the index's given in parameter
		int temp = A[parent];
		A[parent] = A[largestValue];
		A[largestValue] = temp;	
	}
}
