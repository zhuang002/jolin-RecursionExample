import java.util.Scanner;
import java.util.HashMap;

public class RecursionExample {

	static HashMap<Integer, Long> cache =new HashMap<>();
	
	static Long[] f=new Long[1000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print(febonacci(n));
		
	}
	
	static long febonacci(int n) {
		if (n<0) return -1;
		if (n==0) return 0;
		if (n==1) return 1;
		
		if (cache.containsKey(n)) return cache.get(n);
		long result=  febonacci(n-1)+febonacci(n-2);
		cache.put(n,result);
		return result;
	}
	
	static long febonaciiDP(int n) {
		f[0]=0L;
		f[1]=1L;
		for (int i=2;i<n;i++) {
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}

}
