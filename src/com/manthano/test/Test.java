package com.manthano.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.StampedLock;


public class Test
{
	String s;
	int[] arr = {2,1,3,4,5,1,1,1};
	List<String> emptyList = Collections.EMPTY_LIST; // immutable empty List
	List<String> EmptyList = Collections.emptyList();
	List<String> stringEmptyList = Collections.<String>emptyList();

	Arrays.binarySearch(arr,2);
	StringBuilder sb ;
	// StringBuilder sb = "a"; compile-time error
	DelayQueue dq;
	Delayed d;
	Deque deque;
	TransferQueue<?> tq;
	PriorityQueue<?> pq;
	
	Integer i;
	
	ArrayList<String> al;
	LinkedList<String> ll;
	TreeMap tm;
	
	StampedLock sl;
	ReadWriteLock rwl;
	ReadLock rl;
	ReentrantLock reel;
	ReentrantReadWriteLock rrwl;
	
	Thread t;
	ExecutorService es;
	ThreadPoolExecutor tpe;

	/*public int eraseOverlapIntervals(int[][] intervals) {
		int len = intervals.length;
		int result = 0;
		if(len==0)
			return result;
		Arrays.sort(intervals, new Comparator<int[]>(){
			@Override
			public int compare(int[] arr1, int[] arr2){
				return (new Integer(arr1[0]).compareTo(new Integer(arr2[0])));
			}
		});
		int end = intervals[0][1];
		for(int i=1;i<len;i++){
			if(end>intervals[i][0])
			{ end = Math.min(end, intervals[i][1]);
			result++;
			}
			else {
				end=intervals[i][1];
			}
		}
		return result;
	}
}*/
}
