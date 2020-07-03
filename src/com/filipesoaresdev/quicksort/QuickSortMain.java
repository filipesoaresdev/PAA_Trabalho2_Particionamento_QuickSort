package com.filipesoaresdev.quicksort;

public class QuickSortMain {

	public static void main(String[] args) {
		int []vetor = {10, 7, 8, 9, 1, 5}; 
		
	    int n = vetor.length; 
	    QuickSort.quickSortLomuto(vetor, 0, n-1); 
	    System.out.println("Sorted array: "); 
	    
	    
	    for(int i=0; i< vetor.length; i++) {
	    	System.out.println(vetor[i]); 
	    }
	    
	    int []vetor2 = {10, 7, 8, 9, 1, 5}; 
		
	    int n2 = vetor2.length; 
	    QuickSort.quickSortHoare(vetor2, 0, n2-1); 
	    System.out.println("Sorted array: "); 
	    
	    
	    for(int i=0; i< vetor2.length; i++) {
	    	System.out.println(vetor2[i]); 
	    }
	}
	
	

}
