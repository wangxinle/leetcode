package String;

public class Complex_Number_Multiplication_537 {
	
	public String complexNumberMultiply(String a, String b) {
        String[] aa = a.split("[+]");
        String[] bb = b.split("[+]");
        int a_a = Integer.parseInt(aa[0]);
        int b_a = Integer.parseInt(bb[0]);
        int a_b = Integer.parseInt(aa[1].split("i")[0]);
        int b_b = Integer.parseInt(bb[1].split("i")[0]);
        int c_a = a_a*b_a - a_b*b_b;
        int c_b = a_b*b_a + a_a*b_b;
        return ""+c_a+"+"+c_b+"i";
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a+b".split("[+]")[0]);
		System.out.println(new Complex_Number_Multiplication_537().complexNumberMultiply("1+1i", "1+1i"));
	}

}
