package String;

public class Validate_IP_Address_468 {

	public String validIPAddress(String IP) {
        if(IP.contains(".")){
        	if(isV4(IP)){
        		return "IPv4";
        	}else{
        		return "Neither";
        	}
        }else if(IP.contains(":")){
        	if(isV6(IP)){
        		return "IPv6";
        	}else{
        		return "Neither";
        	}
        }else{
        	return "Neither";
        }
    }
	
	public boolean isV4(String ip){
		boolean judge = true;
		if(ip.startsWith(".") || ip.endsWith(".") || ip.contains("-")){
			judge = false;
			return judge;
		}
		String[] ip_data = ip.split("[.]");
		if(ip_data.length != 4){
			System.out.println(ip_data.length);
			judge = false;
			return judge;
		}
		
		for(int i = 0;i < ip_data.length;i++){
			if(ip_data[i].startsWith("0") && ip_data[i].length() > 1){
				judge = false;
				break;
			}else{
				try{
					int number = Integer.parseInt(ip_data[i]);
					if(number < 0 || number > 255){
						judge = false;
						break;
					}
				}catch(NumberFormatException e){
					judge = false;
					break;
				}
				
			}
		}
		return judge;
	}
	
	public boolean isV6(String ip){
		boolean judge = true;
		if(ip.startsWith(":") || ip.endsWith(":") || ip.contains("-")){
			judge = false;
			return judge;
		}
		String[] ip_data = ip.split(":");
		System.out.println(ip_data.length);
		if(ip_data.length != 8){
			judge = false;
			return judge;
		}
		for(int i = 0;i < ip_data.length;i++){
			if(ip_data[i].startsWith("0") && ip_data[i].length() > 4){
				judge = false;
				break;
			}else{
				char[] data = ip_data[i].toCharArray();
				if(data.length > 4){
					judge = false;
					break;
				}
				for(int j = 0;j < data.length;j++){
					if((data[j] >= '0' && data[j] <='9') || (data[j] >= 'a' && data[j] <='f') ||(data[j] >= 'A' && data[j] <='F')){
						
					}else{
						judge = false;
						break;
					}
				}
			}
		}
		return judge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Validate_IP_Address_468().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
	}

}
