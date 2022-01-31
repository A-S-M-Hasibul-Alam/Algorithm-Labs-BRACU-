/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author 18101273
 */
public class MyArray {
    //int [] a = {3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
    
    public MyArray(int array[]){
    
    }

    

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
        static int[] InsertionSort(int a[]){
            for(int i=1; i<a.length; i++){
                int key = a[i];
                int j = i-1;
                while (j>=0 && a[j]>key){
                    a[j+1] = a[j];
                    j = j-1;
                }
            a[j+1] = key;
            }
            return a;
            }
        static int[] merge(int[] a, int start, int end) {
        int mid;
            if((start+end)%2==0) mid = (start+end)/2;
            else mid = ((start+end)/2)+1;
	int n1 = mid - start + 1; 
        int n2 = end - mid ; 

        int [] left = new int [n1]; 
        int [] right = new int [n2]; 

        for (int i = 0 ; i < left.length ; i ++) {  
            left [i] = a [start + i]; 
        }
        for (int i = 0 ; i < right.length ; i ++) { 
            right [i] = a [mid + 1 + i]; 
        }

		int i = 0, j = 0;
		int k = start ;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			a[k] = right[j];
			j++;
			k++;
		}
                return a;
	}
        public static int[] quickSort(int[] a, int start, int end) {
		if (start < end) {
			int pivot = partition (a, start, end) ;
			quickSort (a, start, pivot - 1) ;
			quickSort (a, pivot + 1, end) ;
		}
		return a;
	}
	
	public static int partition (int [] a, int start, int end) {
		int pivot = a [end] ;
		int i = start - 1 ;
		for (int j = start ; j < end ; j ++) {
			if (a [j] <= pivot) {
				i ++ ;
				int temp = a [i] ;
				a [i] = a [j] ;
				a [j] = temp ;
			}
		}
		int temp = a [i + 1] ;
		a [i + 1] = a [end] ;
		a [end] = temp ;
		
		return i + 1 ;
	}
}
        
        
    
    
    

