package Binary;

import java.util.HashMap;

public class Sum_II_454 {


	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer, Integer> sum = new HashMap<>();
        for(int i = 0;i < C.length;i++){
        	for(int j = 0;j < D.length;j++){
        		sum.put(C[i] + D[j], sum.getOrDefault(C[i] + D[j], 0) +1);
        	}
        }
        
        for(int i = 0;i < A.length;i++){
        	for(int j = 0;j < B.length;j++){
        		res += sum.getOrDefault(-A[i] - B [j], 0);
        	}
        }
        return res;
    }
}
