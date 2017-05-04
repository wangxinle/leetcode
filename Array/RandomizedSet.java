package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {

	 /** Initialize your data structure here. */
	HashMap<Integer,Integer> data;
	ArrayList<Integer> index;
	
	Random rand = new Random();
    public RandomizedSet() {
        data = new HashMap<>();
        index = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(data.containsKey(val)){
    		return false;
    	}else{
    		data.put(val, index.size());
    		index.add(val);
    		return true;
    	}
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(!data.containsKey(val)){
    		return false;
    	}else{
    		int position = data.get(val);
    		if(position < index.size() - 1){
    			int last_data = index.get(index.size() - 1);
    			index.set(position, last_data);
    			data.put(last_data, position);
    		}
    		index.remove(index.size() - 1);
    		data.remove(val);
    		return true;
    	}
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	
    	return index.get(rand.nextInt(index.size()));
    }
    
}
