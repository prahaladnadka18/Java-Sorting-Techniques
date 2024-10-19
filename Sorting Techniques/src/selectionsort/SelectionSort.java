package selectionsort;

import java.util.Scanner;

public class SelectionSort {

	static void selectionSort(int[] x) {

		for(int i=0;i<x.length-1;i++) {

			int minIndex=i;

			for(int j=i+1;j<x.length;j++) {

				if(x[j]<x[minIndex]) {
					minIndex=j;
				}

			}

			int temp=x[i];
			x[i]=x[minIndex];
			x[minIndex]=temp;
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();

		int[] a=new int[n];

		System.out.println("Enter "+n+" array elements:");
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();	
		}

		scan.close();

		System.out.println("Before Sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		selectionSort(a);

		System.out.println("\nAfter Sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}


}

/*
OUTPUT :

Enter the size of the array:
8

Enter 8 array elements:
25 38 24 19 85 39 28 56

Before Sorting:
25 38 24 19 85 39 28 56 

After Sorting:
19 24 25 28 38 39 56 85

 */

