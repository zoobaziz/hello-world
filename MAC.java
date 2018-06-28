package wizard_panels;


import java.net.Inet4Address;


import java.net.InetAddress;
import java.net.NetworkInterface;



public class MAC {
	public String[] MACA(){
	        try{
	            InetAddress      addr     =InetAddress.getLocalHost();
	            NetworkInterface network  =NetworkInterface.getByInetAddress(addr);
	            
	            Inet4Address ipaddr = (Inet4Address) Inet4Address.getLocalHost();
	            
	            
	            byte[] mac = network.getHardwareAddress();
	
	            String add = ipaddr.getHostAddress();
	            
	        
	            
	            StringBuilder sb = new StringBuilder();
	            for(int i=0;i<mac.length;i++){
	                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
	            }
	            
	            String[] msg = new String[2];
	            
	            msg[0] = add;
	            msg[1] = sb.toString();
	            
	            return msg;
	            	

	        }
	        catch(Exception E){
	            System.err.println("System Windows MAC Exp : "+E.getMessage());
	            return null;
	        }
	    }
}

