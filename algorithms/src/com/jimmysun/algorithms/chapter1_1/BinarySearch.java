package com.jimmysun.algorithms.chapter1_1;

//二分查找的实现，数组必须是已排序的数组
public class BinarySearch {
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) {
			return -1;  //未找到
		}
		int mid = lo + (hi - lo) / 2;  //取low high的中值
		if (key < a[mid]) { //与key做比较，小于的话，mid左移一位继续查找
			return rank(key, a, lo, mid - 1);
		} else if (key > a[mid]) {  //与key做比较，大于的话，mid右移一位继续查找
			return rank(key, a, mid + 1, hi);
		} else {
			return mid;
		}
	}

	//非递归写法
	public static int rank1(int key,int[] a,int lo,int hi)
	{
		while (lo<=hi){
			int mid = lo +(hi - lo)/2;
			if (key ==a[mid])
				return mid;
				else  if(key < a[mid])
					hi = mid -1;
			  	else
					lo = mid +1;

		}
		return -1;
	}


	public static void main(String[] args) {
		//返回数组的下标，未找到返回-1
		int [] a = new int[]{1,3,9,28,29,34,45,67};
		int key = rank(29,a);
		System.out.println(key);
	}
}
