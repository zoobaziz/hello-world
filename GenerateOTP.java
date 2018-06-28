package wizard_panels;
public class GenerateOTP {
    /**
    * Method for Generate OTP String
    * @return 
    */

	public String generateOTP() {
		int randomPin   =(int)(Math.random()*999999)+1000;
		String otp  =String.valueOf(randomPin);
		return otp;
		
		
	}
   /*
	public static void main(String[] args) {
		String otpSting = generateOTP();
		System.out.println("OTP : "+otpSting);
	}
	*/
}