package String;

public class Number_of_Segments_in_a_String_434 {

	public int countSegments(String s) {
        
        String[] data = s.split(" ");
        int number = 0;
        for(int i = 0;i < data.length;i++){
        	
        	if(!data[i].equals("")){
        		number += 1;
        	}
        }
        return number;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Number_of_Segments_in_a_String_434().countSegments(", , , ,        a, eaefa"));
	}

}
