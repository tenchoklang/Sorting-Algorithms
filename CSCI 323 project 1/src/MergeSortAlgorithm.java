
public class MergeSortAlgorithm extends FileIO{

	public int[] MergeSort(int [] A, int startPoint, int endPoint){
		
		//count =0;
		if(startPoint < endPoint){
		
			int midPoint = (startPoint + endPoint)/2;
			MergeSort(A,startPoint,midPoint);
			MergeSort(A,midPoint+1,endPoint);
			Merge(A,startPoint, midPoint, endPoint);
		}
		return A;
	}
	
	private void Merge(int [] A, int startPoint, int midPoint, int endPoint){

		int L_size = midPoint - startPoint + 1;//array size of L
		int R_size = endPoint - midPoint;//array size of R
		
		int[] L = new int[L_size+1];
		int[] R = new int[R_size+1];
		
		for(int i = 0; i<L_size;i++){//stores everthing from A that containts
			L[i] = A[startPoint + i];
		}
		for(int j = 0; j<R_size;j++){
			R[j] = A[midPoint + j+1];
		}
		
		L[L_size] = Integer.MAX_VALUE;//sential value so that we know we have reached the end of array
		R[R_size] = Integer.MAX_VALUE;
		
		int i = 0;//index of left subarray
		int j = 0;//index of right subarray
		
		for(int k=startPoint; k<=endPoint; k++){//MERGING, compares values between L array and R array and stores
			//them into the original A array in order
			count++;
			if(L[i] <= R[j]){//L[i] smaller then R[j]
				A[k] = L[i];//store L[i] values into A[]
				i++;
			}
			else{//R[j] smaller then L[i]
				A[k] = R[j];//store R[j] values into A[]
				j++;
			}
		}
	}
}

