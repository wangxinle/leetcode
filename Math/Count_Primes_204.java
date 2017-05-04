package Math;

import java.util.Arrays;

public class Count_Primes_204 {
	
	public boolean isPrimes(int n){
		boolean judge = true;
		if((n > 2 && n %2 == 0) || n == 1){
			judge = false;
			return judge;
		}
		for(int i = 2;i <= Math.sqrt(n);i++){
			if(n % i == 0){
				judge = false;
				break;
			}
		}
		return judge;
	}
	

	public int countPrimes(int n) {
        int result = 0;
        for(int i = 2;i < n;i++){
        	if(isPrimes(i)){
        		result += 1;
        	}
        }
        return result;
    }
	
	public int countPrimesNew(int n){
		int result = 0;
		boolean[] judge = new boolean[n+1];
		Arrays.fill(judge, true);
		for(int i = 2;i < n;i++){
			for(int j = 2*i;j < n;j += i){
				if(judge[j]){
					judge[j] = false;
				}
			}
		}
		for(int i = 2;i < n;i++){
			if(judge[i]){
				result += 1;
			}
		}
		System.out.println(result);
		return result;
		
	}
	
	/**
     * Count the number of prime numbers less than a non-negative number, n
     * @param n a non-negative integer
     * @return the number of primes less than n
     */
    public int countPrimesMin(int n) {
        
        /**
         * if n = 2, the prime 2 is not less than n,
         * so there are no primes less than n
         */
        if (n < 3) return 0;
        
        /** 
         * Start with the assumption that half the numbers below n are
         * prime candidates, since we know that half of them are even,
         * and so _in general_ aren't prime.
         * 
         * An exception to this is 2, which is the only even prime.
         * But also 1 is an odd which isn't prime.
         * These two exceptions (a prime even and a for-sure not-prime odd)
         * cancel each other out for n > 2, so our assumption holds.
         * 
         * We'll decrement count when we find an odd which isn't prime.
         *
         * If n = 3,  c = 1.
         * If n = 5,  c = 2.
         * If n = 10, c = 5.
         */
        int c = n / 2;
        
        /**
         * Java initializes boolean arrays to {false}.
         * In this method, we'll use truth to mark _composite_ numbers.
         * 
         * This is the opposite of most Sieve of Eratosthenes methods,
         * which use truth to mark _prime_ numbers.
         * 
         * We will _NOT_ mark evens as composite, even though they are.
         * This is because `c` is current after each `i` iteration below.
         */
        boolean[] s = new boolean[n];
        
        /**
         * Starting with an odd prime-candidate above 2, increment by two
         * to skip evens (which we know are not prime candidates).
         */
        for (int i = 3; i * i < n; i += 2) {
            if (s[i]) {
                // c has already been decremented for this composite odd
                continue;
            }
            
            /** 
             * For each prime i, iterate through the odd composites
             * we know we can form from i, and mark them as composite
             * if not already marked.
             * 
             * We know that i * i is composite.
             * We also know that i * i + i is composite, since they share
             * a common factor of i.
             * Thus, we also know that i * i + a*i is composite for all real a,
             * since they share a common factor of i.
             * 
             * Note, though, that i * i + i _must_ be composite for an
             * independent reason: it must be even.
             * (all i are odd, thus all i*i are odd,
             * thus all (odd + odd) are even).
             * 
             * Recall that, by initializing c to n/2, we already accounted for
             * all of the evens less than n being composite, and so marking
             * i * i + (odd)*i as composite is needless bookkeeping.
             * 
             * So, we can skip checking i * i + a*i for all odd a,
             * and just increment j by even multiples of i,
             * since all (odd + even) are odd.
             */
            for (int j = i * i; j < n; j += 2 * i) {
                if (!s[j]) {
                    c--;
                    s[j] = true;
                    }
                }
            }
        for(int i = 0;i < s.length;i++){
        	System.out.println(s[i]);
        }
        return c;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new Count_Primes_204().countPrimesNew(1));
		System.out.println(new Count_Primes_204().countPrimesMin(15));
	}

}
