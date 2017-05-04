package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Find_K {
	
//	public void swap(int[] data,int i,int j){
//		int temp = data[i];
//		data[i] = data[j];
//		data[j] = temp;
//	}
//	
//	public int partition(int[] data,int low,int high){
//		int temp = data[low];
//		int i = low+1;
//		int j = high;
//		while(i < j){
//			while(i < j && data[i] <= temp){
//				i++;
//			}
//			while(i < j && data[j] >= temp){
//				j--;
//			}
//			swap(data,i,j);
//		}
//		
////		swap(data,low,j);
//		data[low] = data[j];
//		data[j] = temp;
//		return j;
//		
//		
//	}
//	
//	public int findK(int[] data,int k,int low,int high){
//		int position = -1;
//		if(k > high - low + 1){
//			return position;
//		}
//		position = partition(data,low,high);
////		System.out.println(position);
//		if(position == k - 1){
//			return data[position];
//		}else if(position < k - 1){
//			return findK(data, k, position + 1, high);
//		}else{
//			return findK(data, k, low,position-1);
//		}
//		
//	}

//	int quickselect(int a[], int b, int e, int k){  
//		  int i = b ;  
//		  int j = e + 1;  
//		  int x = a[i];  
//		  while(true){  
//		    while(a[++i] < x && i < j);  
//		    while(a[--j] > x);  
//		    if(i >= j)  
//		      break;  
//		    else  {
//		    	int temp = a[i];
//		    	a[i] = a[j];
//		    	a[j] = temp;
//		    }
////		      swap(a[i], a[j]);  
//		  }  
//		  a[b] = a[j];  
//		  a[j] = x;  
//		  if(k - 1 == j)  
//		    return a[j];  
//		  else if(k - 1 > j)  
//		    return quickselect(a, j + 1, e, k);  
//		  else  
//		    return quickselect(a, b, j - 1, k);  
//		  
//		}  
	
	public int minMoves2(int[] A) {
	    int sum = 0, median = quickselect(A, A.length/2+1, 0, A.length-1);
	    for (int i=0;i<A.length;i++) sum += Math.abs(A[i] - median);
	    return sum;
	}

	public int quickselect(int[] A, int k, int start, int end) {
	    int l = start, r = end, pivot = A[(l+r)/2];
	    while (l<=r) {
	        while (A[l] < pivot) l++;
	        while (A[r] > pivot) r--;
	        if (l>=r) break;
	        swap(A, l++, r--);
	    }
	    if (l-start+1 > k) return quickselect(A, k, start, l-1);
	    if (l-start+1 == k && l== r) return A[l];
	    return quickselect(A, k-r+start-1, r+1, end);
	}

	public void swap(int[] A, int i, int j) {
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	
	public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] judge = new boolean[s.length() + 1];
        judge[0] = true;
        for(int i = 1;i <= s.length();i++){
            for(int j = 0;j < i;j++){
            	if(s.substring(j,i) == "tc" || j == 4){
            		System.out.println(judge[j]+"  "+s.substring(j,i) );
            	}
                if(judge[j] && wordDict.contains(s.substring(j,i))){
                    judge[i] = true;
                    break;
                }
            }
        }
        for(int i = 0;i <= s.length();i++){
        	System.out.println(judge[i]);
        }
        return judge[s.length()];
    }

	public static void main(String[] args) {
//		List<String> dict = new ArrayList<String>();
//		dict.add("leet");
//		dict.add("tc");
//		System.out.println("".substring(10));
//		System.out.println(new Find_K().wordBreak("leetce", dict));
		
		PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
		temp.add(1);
		temp.add(3);
		temp.add(2);
		temp.offer(4);
		System.out.println(temp.poll());
		System.out.println(temp.size());
		System.out.println(temp.peek());
		System.out.println(temp.size());
		// TODO Auto-generated method stub
//		int[] data = {3,2,4,5,1,6,9,7,8};
//		
//		System.out.println(new Find_K().quickselect(data,4,0,8));
//		System.out.println(data[0]+""+data[8]);
//		System.out.println(new Find_K().findK(data,2,0,8));
////		System.out.println(data[0]+""+data[8]);
//		System.out.println(new Find_K().findK(data,3,0,8));
////		System.out.println(data[0]+""+data[8]);
//		System.out.println(new Find_K().findK(data,4,0,8));
//		System.out.println(data[0]+""+data[8]);
		
	}

}
