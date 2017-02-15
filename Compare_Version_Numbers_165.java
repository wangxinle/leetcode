package LeetCode;

public class Compare_Version_Numbers_165 {


	public int compareVersion(String version1, String version2) {
		
		String[] data1 = version1.split("\\.");
		String[] data2 = version2.split("\\.");		
		int i = 0;
		int j = 0;		
		while(i < data1.length && j < data2.length){
			if(Integer.parseInt(data1[i]) == Integer.parseInt(data2[j])){
				i++;
				j++;
			}else if(Integer.parseInt(data1[i]) > Integer.parseInt(data2[j])){
				return 1;
			}else{
				return -1;
			}
		}
		if(i == data1.length && j == data2.length){
			return 0;
		}else if(i == data1.length){
			
			for(int k = j;k < data2.length;k++){
				if(Integer.parseInt(data2[k])!=0){
					return -1;
				}
			}
			return 0;
		}else{
			for(int k = i;k < data1.length;k++){
				if(Integer.parseInt(data1[k])!=0){
					return 1;
				}
			}
			return 0;
		}
				
    }
	public static void main(String[] args) {
		String a = "01";
		System.out.println(Integer.parseInt(a));
		//System.out.println(new Compare_Version_Numbers_165().compareVersion("1.0.0", "1.1"));
	}

}
