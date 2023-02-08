package Test;

import java.util.*;

public class SortArray {
	
	public static Integer sum(List<Integer> list) {
		int n=0;
		for(int i=0;i<list.size();i++) {
			n+=list.get(i);
		}
		return n;
	}
	public static void sortMyArray(Integer[] input) {
		
		List<Integer> list=Arrays.asList(input);
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		
		for(Integer i:list) {
			if(sum(l1)<sum(l2) && l1.size()<=list.size()/2) {
				l1.add(i);
			}else {
				l2.add(i);
			}
		}
		
		List<Integer> list1=new ArrayList<>();
		list1.addAll(l1);
		list1.addAll(l2);
		System.out.println(list1);
		
		System.out.println("The Difference Between to Halves is: "+Math.abs(sum(l1)-sum(l2)));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr,Collections.reverseOrder());
		sortMyArray(arr);

	}

}
