package Test;

import java.util.*;

public class PrimeFactors {
	
	static int isPrime(long n)
	{
		if(n<=1)
		{
			return 0;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return 1;
		
	}
	
	
	public static List<Integer> computePrimeFactors(long x)
	{
		List list = new ArrayList();
		for(int i=0;i<x;i++)
		{
			if(isPrime(i)==1)
			{
				list.add(i);
			}
		}
		int n= list.size();
		return list;
	}
	
	public static void sumSubsets(
	        long set[], int n, int target)
	    {
	        long x[] = new long[set.length];
	        int j = set.length - 1;

	        while (n > 0) {
	            x[j] = n % 2;
	            n = n / 2;
	            j--;
	        }
	 
	        long sum = 0;
	        
	        for (int i = 0; i < set.length; i++)
	            if (x[i] == 1)
	                sum = sum + set[i];
	        
	        StringBuilder sb=new StringBuilder();
	        if (sum == target) {
	            for (int i = 0; i < set.length; i++) {
	                if (x[i] == 1) {
	                	sb.append(set[i]+"+");
	                }
	            }
	            String str=sb.substring(0, sb.length()-1);
	            System.out.println(str);
	            System.exit(0);
	        }
	    }
	 
	
	    public static void findSubsets(long[] arr, int K)
	    {
	        long x = (long)Math.pow(2, arr.length);
	 
	        for (int i = 1; i < x; i++)
	            sumSubsets(arr, i, K);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeFactors p = new PrimeFactors();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x =sc.nextInt();
		
		List<Integer> list=computePrimeFactors(x);
		long[] arr = new long[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]= list.get(i);
		}
		findSubsets(arr,x);
	}

}
