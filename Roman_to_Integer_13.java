package LeetCode;

public class Roman_to_Integer_13 {

	/**
	 * 
	 * @param s
	 * @return
	 * 1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

	   10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

	   100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

	   1000~3000: {"M", "MM", "MMM"}.
	 */
	public int toInt(String s){
		switch (s) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;		
		default:
			return 1000;
		}
	}
	public int romanToInt(String s) {
			char[] data = s.toCharArray();
			int result = toInt(data[0]+"");
			for(int i = 1;i < data.length;i++){
				if(toInt(data[i-1]+"") < toInt(data[i]+"")){
					result += toInt(data[i]+"")-2*toInt(data[i-1]+"");
				}else{
					result += toInt(data[i]+"");
				}
			}
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Roman_to_Integer_13().romanToInt("DCXXI"));
	}

}
