package bubblesort;

import java.util.Scanner;

public class BubbleUpSorting {

	static void bubbleUpSort(int[] x) {

		for(int i=0;i<x.length-1;i++) {

			boolean rs=true;

			for(int j=0;j<x.length-1-i;j++) {

				if(x[j]>x[j+1]) {

					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;

					rs=false;
				}

			}

			if(rs)
				break;
			
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

		bubbleUpSort(a);

		System.out.println("\nAfter Sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
