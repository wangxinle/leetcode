package Array;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_II_119 {

	public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        if(rowIndex == 0){
        	result.add(1);
        }else{
        	List<Integer> temp = getRow(rowIndex - 1);
        	result.add(1);
        	for(int i = 0;i < temp.size()-1;i++){
        		result.add(temp.get(i) + temp.get(i+1));
        	}
        	result.add(1);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Pascal_Triangle_II_119().getRow(20));
	}

}
