package String;

public class Student_Attendance_Record_I_551 {

	public boolean checkRecord(String s) {
        boolean judge = true;
        char[] data = s.toCharArray();
        int l = 0;
        int a = 0;
        for(int i = 0;i < data.length;i++){
        	if(data[i] == 'A'){
        		a += 1;
        		if(a > 1){
        			judge = false;
        			return judge;
        		}
        	}
        	if(data[i] == 'L'){
        		l += 1;
        		if(l > 2){
        			judge = false;
        			return judge;
        		}
        	}
        }
        return judge;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
