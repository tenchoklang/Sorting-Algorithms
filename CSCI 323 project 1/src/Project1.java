/*
 * Author:Tenzin Choklang
 * Class: CSCI 323 Design and Analysis of Algorithms
 * Date: 3/21/17
 * Email: tenchoklang@gmail.com
 * Project 1: Sorting Algorithms
 */
import java.io.IOException;

public class Project1 {

	public static void main(String []args) throws IOException{

		InsertionSortAlgorithm SortInsertion = new InsertionSortAlgorithm();
		MergeSortAlgorithm SortMerge = new MergeSortAlgorithm();
		HeapSortAlgorithm SortHeap = new HeapSortAlgorithm();
		QuickSortAlgorithm SortQuick = new QuickSortAlgorithm();

		String FileName = "Num";//file name without the number
		
		for(int i=0; i<4;i++){//loop for sort type
			int FileNumber = 8;
			for(int j = 0; j<12; j++){//loop for file
				
				String Fullfilename = FileName + Integer.toString(FileNumber) + ".txt";
				int[] A = new int[FileNumber];//initialize array
				A = SortInsertion.FileReader(Fullfilename, FileNumber);//shared method filereader
				
				switch(i){
					
				case 0:
					SortInsertion.FileWriter("InsertionSort", FileNumber, SortInsertion.Sort(A));//pass file name, number and sorted array 
					break;
				case 1:
					SortMerge.FileWriter("MergeSort", FileNumber, SortMerge.MergeSort(A, 0, A.length-1));//pass file name, number and sortedarray 
					break;
				case 2:
					SortHeap.FileWriter("HeapSort", FileNumber, SortHeap.Sort(A));//pass file name, number and sortedarray 
					break;
				case 3:
					SortQuick.FileWriter("QuickSort", FileNumber, SortQuick.QuickSort(A));//pass file name, number and sortedarray 
					break;
					
				default: System.out.println("Sorry No More Algorithms :("); 
					break;
				}
				FileNumber = FileNumber * 2;//next file number
			}
		}
	}
}
